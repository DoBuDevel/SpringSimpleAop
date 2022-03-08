package com.study.aop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.aop.annotation.LogExcutionTime;


@Controller
public class TestController {
	
	@LogExcutionTime
	@ResponseBody
	@GetMapping("/")
	public String test() {
		return "test";
	}
}
