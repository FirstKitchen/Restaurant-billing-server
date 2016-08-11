package com.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.restaurant.bean.UserBean;

@Controller
@RequestMapping("/")
public class DefaultController {

	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody UserBean getUser(){		
		UserBean userBean=new UserBean("Yadab","Nepal","samipnepal@gmail.com","YA001","samipnepal","nepal");
		return userBean;
	}
}
