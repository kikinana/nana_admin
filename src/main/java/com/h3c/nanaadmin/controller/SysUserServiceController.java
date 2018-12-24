package com.h3c.nanaadmin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.h3c.nanaadmin.service.SysUserService;

@RestController
@RequestMapping("user")
public class SysUserServiceController {
	@Autowired
	private SysUserService sysUserService;
	
	private Logger log=LoggerFactory.getLogger(SysUserServiceController.class);
	
	@GetMapping(value="/findByUserId")
    public Object findByUserId(@RequestParam Long userId) {
        return sysUserService.findByUserId(userId);
    }
    
    @GetMapping(value="/findAll")
    public Object findAll() {
        return sysUserService.findAll();
    }
	
	
	

}
