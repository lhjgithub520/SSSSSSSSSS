package com.pingyougou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pingyougou.service.UserService;

@RestController
public class Usercontroller {

	@Reference
	UserService userService;
	
	
	@RequestMapping("/user")
	public String findAll() {
		return userService.findAll();
	}
}
