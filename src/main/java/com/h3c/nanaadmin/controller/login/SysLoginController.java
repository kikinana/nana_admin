package com.h3c.nanaadmin.controller.login;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.h3c.nanaadmin.common.utils.PasswordUtils;
import com.h3c.nanaadmin.http.HttpResult;
import com.h3c.nanaadmin.model.SysUser;
import com.h3c.nanaadmin.model.SysUserToken;
import com.h3c.nanaadmin.model.vo.LoginBean;
import com.h3c.nanaadmin.service.SysUserService;
import com.h3c.nanaadmin.service.SysUserTokenService;

@RestController
public class SysLoginController {
	@Autowired
	private SysUserService sysUserService;
	@Autowired
	private SysUserTokenService sysUserTokenService;
	
	/**
	 * 登录接口
	 */
	@PostMapping(value = "/sys/login")
	public HttpResult login(@RequestBody LoginBean loginBean) throws IOException {
		String username = loginBean.getUsername();
		String password = loginBean.getPassword();

		// 用户信息
		SysUser user = sysUserService.findByUserName(username);

		// 账号不存在、密码错误
		if (user == null) {
			return HttpResult.error("账号不存在");
		}
		
		if (!match(user, password)) {
			return HttpResult.error("密码不正确");
		}

		// 账号锁定
		if (user.getStatus() == 0) {
			return HttpResult.error("账号已被锁定,请联系管理员");
		}

		// 生成token，并保存到数据库
		SysUserToken data = sysUserTokenService.createToken(user.getId());
		return HttpResult.ok(data);
	}

	/**
	 * 验证用户密码
	 * @param user
	 * @param password
	 * @return
	 */
	public boolean match(SysUser user, String password) {
		return user.getPassword().equals(PasswordUtils.encrypte(password, user.getSalt()));
	}


}
