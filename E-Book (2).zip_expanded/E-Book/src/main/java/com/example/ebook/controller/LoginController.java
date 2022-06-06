package com.example.ebook.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ebook.model.LoginModel;
import com.example.ebook.model.UserModel;
import com.example.ebook.repository.UserRepository;

@RestController
@RequestMapping("/LoginController")
//@CrossOrigin(origins = "https://8081-aefadbebadbccbedfedddfdaeefcd.examlyiopb.examly.io", allowedHeaders = "*")
public class LoginController {

	@Autowired
	UserRepository userRepo;
	
	
	@PostMapping("/login")
	public boolean checkUser(@RequestBody LoginModel data) {
		System.out.println(data);
		Optional<UserModel> user = userRepo.findById(data.getEmail());
		if(user.isEmpty()) {
			System.out.println("false");
			return false;
		}else {
			if(user.get().getPassword().equals(data.getPassword())) {
				System.out.println("true");
				return true;				
			}else {
				System.out.println("false");
				return false;
			}
		}
	}
}
