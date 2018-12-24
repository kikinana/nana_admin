package com.h3c.nanaadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.h3c.nanaadmin.mapper")
public class NanaAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(NanaAdminApplication.class, args);
	}

}

