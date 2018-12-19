package com.xgjgas.gascloud;


import java.util.List;
import java.util.Properties;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import com.xgjgas.gascloud.com.yphx.service.impl.XgjSysUserService;

@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.xgjgas.gascloud.com.yphx.dao")
@RestController
public class GasCloudUserApplication {
	@Autowired
	private XgjSysUserService xgjSysUserService;

	public static void main(String[] args) {
		SpringApplication.run(GasCloudUserApplication.class, args);
	}
	
	/*@RequestMapping("/index")
	public String getAllSysUser() {
		List<XgjSysUser> sysUsers = xgjSysUserService.getList(new XgjSysUserExample());
		return JSONArray.fromObject(sysUsers).toString();
	}*/
	
	@Bean
	public SimpleMappingExceptionResolver simpleMappingExceptionResolver() {
		SimpleMappingExceptionResolver simpleMappingExceptionResolver = new SimpleMappingExceptionResolver();
		Properties mappings = new Properties();
		mappings.setProperty("org.apache.shiro.authz.UnauthorizedException", "/403");
		mappings.setProperty("org.apache.shiro.authz.UnauthenticatedException", "/403");
		simpleMappingExceptionResolver.setExceptionMappings(mappings);
		return simpleMappingExceptionResolver;
	}
}
