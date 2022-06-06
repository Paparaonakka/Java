package com.example.ebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ebook.model.UserTempModel;
import com.example.ebook.service.UserService;

@RestController
@RequestMapping("/SignupController")
//@CrossOrigin(origins = "https://8081-aefadbebadbccbedfedddfdaeefcd.examlyiopb.examly.io", allowedHeaders = "*")
public class SignupController {

	@Autowired
	UserService userService;
	
	@PostMapping("/signup")
	public boolean saveUser(@RequestBody UserTempModel user) {
		System.out.println(user);
		return userService.saveUser(user).equals("success") ? true : false;
	}
	
	
}
