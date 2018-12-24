package com.h3c.nanaadmin.service;

import java.util.List;
import java.util.Set;

import com.h3c.nanaadmin.model.SysUser;
import com.h3c.nanaadmin.model.SysUserToken;
import com.h3c.nanaadmin.service.curd.CurdService;

public interface SysUserService extends CurdService<SysUser>{
	/**
     * 根据用户ID查找用户
     * @param userId
     * @return
     */
    SysUser findByUserId(Long userId);

    /**
     * 查找所有用户
     * @return
     */
    List<SysUser> findAll();
	/**
	 * 查找用户的菜单权限标识集合
	 * @param userName
	 * @return
	 */
	Set<String> findPermissions(String userName);

	SysUser findByUserName(String username);


}
