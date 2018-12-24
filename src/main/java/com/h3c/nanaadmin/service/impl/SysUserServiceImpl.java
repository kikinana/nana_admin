package com.h3c.nanaadmin.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h3c.nanaadmin.mapper.SysUserMapper;
import com.h3c.nanaadmin.model.SysMenu;
import com.h3c.nanaadmin.model.SysUser;
import com.h3c.nanaadmin.page.ColumnFilter;
import com.h3c.nanaadmin.page.MybatisPageHelper;
import com.h3c.nanaadmin.page.PageRequest;
import com.h3c.nanaadmin.page.PageResult;
import com.h3c.nanaadmin.service.SysMenuService;
import com.h3c.nanaadmin.service.SysUserService;

@Service
public class SysUserServiceImpl implements  SysUserService{
	@Autowired
	private SysUserMapper sysUserMapper;
	@Autowired
	private SysMenuService sysMenuService;

	@Override
	public SysUser findByUserId(Long userId) {
		
		return sysUserMapper.selectByPrimaryKey(userId);
	}

	@Override
	public List<SysUser> findAll() {
	
		return sysUserMapper.selectAll();
	}

	@Override
	public int save(SysUser record) {
		return sysUserMapper.insertSelective(record);
	}

	@Override
	public int update(SysUser record) {
		return sysUserMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int delete(SysUser record) {
		return sysUserMapper.deleteByPrimaryKey(record.getId());
	}

	@Override
	public int delete(List<SysUser> records) {
		for(SysUser record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public SysUser findById(Long id) {
		return sysUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public SysUser findByUserName(String username) {
		return sysUserMapper.findByUserName(username);
	}
	
	@Override
	public PageResult findPage(PageRequest pageRequest) {
		ColumnFilter columnFilter = pageRequest.getColumnFilter(NAME);
		if(columnFilter != null) {
			return MybatisPageHelper.findPage(pageRequest, sysUserMapper, "findPageByName", columnFilter.getValue());
		}
		return MybatisPageHelper.findPage(pageRequest, sysUserMapper);
	}

	@Override
	public Set<String> findPermissions(String userName) {
		Set<String> perms = new HashSet<>();
		List<SysMenu> sysMenus = sysMenuService.findByUser(userName);
		for(SysMenu sysMenu:sysMenus) {
			perms.add(sysMenu.getPerms());
		}
		return perms;
	}


}
