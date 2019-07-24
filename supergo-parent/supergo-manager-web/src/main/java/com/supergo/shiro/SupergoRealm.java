package com.supergo.shiro;

import java.util.List;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import com.supergo.pojo.TbAuthority;
import com.supergo.pojo.TbSysuser;
import com.supergo.service.TbUserService;

/**
 * 自定义shiro的realm类（完成MySQL数据库的数据操作）
 * 
 * @author 王斌
 *
 */

public class SupergoRealm extends AuthorizingRealm {
	@Autowired
	private TbUserService service;

	/**
	 * 获取授权信息
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		System.out.println("这是shiro的授权信息");
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		//获取当前登录用户
		TbSysuser user = (TbSysuser)principalCollection.getPrimaryPrincipal();
		//调用用户服务,根据用户名查询它所拥有的权限集合list<>
		List<TbAuthority> list = service.queryAuthorityCode(user.getUserName());
		System.out.println("权限名称------------"+list);
		for (TbAuthority authority : list) {
			System.out.println(authority.getCode());
			info.addStringPermission(authority.getCode());
		}
		return info;
	}

	/**
	 * 获取认证信息 返回值为null，就表示用户不存在
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		System.out.println("这是shiro的认证信息");
		// 获取登录令牌
		UsernamePasswordToken token = (UsernamePasswordToken) arg0;
		// 获取用户名
		String username = token.getUsername();
		// 调用service,查询用户是否存在
		TbSysuser user = service.selectUserByUserName(username);
		if (user == null) {
			return null;
		}
		//第一个参数：主要认证信息，其实可以写任何信息，一般写上登录用户信息
		//第二个参数：凭证，其实指的就是密码
		//第三个参数：就是当前的realm的名称
		AuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(), this.getClass().getSimpleName());
		return info;
	}

}
