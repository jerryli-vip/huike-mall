package com.supergo.service;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.supergo.mapper.ext.TbOperatorSsoExt;
import com.supergo.pojo.TbSysuser;
import com.supergo.utils.ResultVO;

@Service
public class TbLoginServiceImpl implements TbLoginService {
	@Autowired
	private TbOperatorSsoExt mapper;

	@Override
	public ResultVO login(String username, String password) {
		if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password))
			return ResultVO.build(500, "用户名或密码为空");

		// 判断用户是否为空
		TbSysuser user = mapper.selectUserByUsername(username);
		if (user == null)
			return ResultVO.build(500, "用户名不存在");

		if (!DigestUtils.md5Hex(password).equals(user.getPassword()))
			return ResultVO.build(500, "密码错误");
		return ResultVO.build(200, "登录成功");
	}
}
