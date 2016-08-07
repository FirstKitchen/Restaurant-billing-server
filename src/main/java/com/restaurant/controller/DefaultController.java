package com.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.restaurant.bean.UserBean;

@Controller
@RequestMapping("/hello")
public class DefaultController {

	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody UserBean getUser(){		
		UserBean userBean=new UserBean();
		userBean.setFirstName("Yadab");
		userBean.setLastName("Nepal");
		userBean.setEmail("samipnepal@gmail.com");
		userBean.setId("YA001");
		userBean.setUsername("samipnepal");
		userBean.setPassword("nepal");
		return userBean;
	}
}
