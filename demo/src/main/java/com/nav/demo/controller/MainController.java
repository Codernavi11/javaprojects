package com.nav.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nav.demo.daoservice.DaoService;
import com.nav.model.Employee;

@RestController
public class MainController {
	@Autowired
	private DaoService dao;
	
@RequestMapping("/home")
public String getCity() {
	return "Delhi";
}
@RequestMapping("/name")
public String Name() {
	return "Naveen";
}
@RequestMapping("/dob")
public String getDOB() {
	
	return "12/12/1997";
}
@RequestMapping("/address")
public String getAddress() {
	return "Hiiiiiiii";
}
@RequestMapping(value="/register",method = RequestMethod.POST)
public String register(@RequestBody Employee e) {
	
	String str=dao.register(e);
	return str;
}
}
