package com.supergo.component.search.util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.settings.Settings.Builder;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;

public class ElasticSearchClientHelper {
	// ES客户端缓存，key为集群名称，value为客户端对象
	private Map<String, Client> clientMap = new ConcurrentHashMap<>();

	// ES集群节点地址
	@Value("${es.transport.address}")
	private String inetAddress;

	// ES集群名称
	@Value("${es.cluster.name}")
	private String clusterName = "auto-es-pro";

	// 是否自动嗅探整个集群的状态
	@Value("${es.client.transport.sniff}")
	private boolean clientTransportSniff;

	@Value("${index.number_of_shards}")
	private int indexNumberOfShards;

	@Value("${index.number_of_replicas}")
	private int indexNumberOfReplicas;

	/** 获取单例ElasticSearchClientHelper --begin **/
	// 构造方法私有
	private ElasticSearchClientHelper() {
		init();
	}

	public static final ElasticSearchClientHelper getInstance() {
		return ClientHolder.INSTANCE;
	}

	private static class ClientHolder {
		private static final ElasticSearchClientHelper INSTANCE = new ElasticSearchClientHelper();
	}

	/** 获取单例ElasticSearchClientHelper --end **/

	private Settings initSettings() {
		Builder builder = Settings.builder();

		// cluster.name: 集群名称
		if (!StringUtils.isEmpty(clusterName)) {
			builder.put("cluster.name", clusterName);
		}
		// client.transport.sniff: 是否自动嗅探整个集群的状态，把集群中其他ES节点的ip添加到本地的客户端列表中
		if (!StringUtils.isEmpty(clientTransportSniff)) {
			builder.put("client.transport.sniff", clientTransportSniff);
		}
		// 集群分片数
		if (!StringUtils.isEmpty(indexNumberOfShards)) {
			builder.put("index.number_of_shards", indexNumberOfShards);
		}
		// 集群副本数
		if (!StringUtils.isEmpty(indexNumberOfReplicas)) {
			builder.put("index.number_of_replicas", indexNumberOfReplicas);
		}
		return builder.build();
	}

	private void init() {
		try {
			// 1.设定Settings
			Settings settings = initSettings();
			// 2. 创建访问ES服务器的客户端
			TransportClient client = new PreBuiltTransportClient(settings);
			// 2.1 解析ES集群节点的IP地址
			TransportAddress[] addresses = getAllAddress();
			if (addresses != null && addresses.length > 0) {
				for (int i = 0; i < addresses.length; i++) {
					// 2.2 给客户端对象添加ES集群节点信息
					client.addTransportAddress(addresses[i]);
				}
			}
			// 3.将客户端放入Map缓存中
			clientMap.put(clusterName, client);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取
	 * 
	 * @return
	 * @throws UnknownHostException
	 */
	private TransportAddress[] getAllAddress() throws UnknownHostException {
		if (inetAddress == null || inetAddress.length() <= 10) {
			return null;
		}
		// 多个IP地址之间使用逗号,分割
		String[] inetAddressArray = inetAddress.split(",");
		List<TransportAddress> list = new ArrayList<>();

		for (String inetAddress : inetAddressArray) {
			// 校验网络地址是否不为空，且长度大于10，且包含冒号
			if (!StringUtils.isEmpty(inetAddress) && inetAddress.length() >= 10 && inetAddress.contains(":")) {
				// 将网络地址解析为ip和端口组成的数组
				String[] ipAndPort = inetAddress.split(":");
				// 校验ip和端口是否书写正确
				if (ipAndPort.length == 2 && ipAndPort[0].matches("(\\d{1,3}\\.){3}\\d{1,3}")
						&& ipAndPort[1].matches("\\d{1,6}")) {
					list.add(new TransportAddress(InetAddress.getByName(ipAndPort[0]), Integer.valueOf(ipAndPort[1])));
				}
			}
		}
		TransportAddress[] addresses = new TransportAddress[list.size()];
		for (int i = 0; i < list.size(); i++) {
			addresses[i] = list.get(i);
		}
		return addresses;

	}

	public Client getClient() {
		return getClient(clusterName);
	}

	private Client getClient(String clusterName) {
		return clientMap.get(clusterName);
	}

}
