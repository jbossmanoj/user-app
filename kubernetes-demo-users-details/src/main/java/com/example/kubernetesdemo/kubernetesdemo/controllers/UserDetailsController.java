package com.example.kubernetesdemo.kubernetesdemo.controllers;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailsController {
	
	private List<User> users;
	
	public UserDetailsController() {
		
	}

	@GetMapping("/")
	public String index(Model model) {
		
		return "<h1>Sample Kubernetes Application</h1>";
	}
	

	
	@GetMapping("/user/{id}")
	@CrossOrigin
	public User getUserDetails(@PathVariable Integer id) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return User.getAllUsers().stream()
		.filter(user -> user.getId().equals(id))
		.map( user -> {
			user.setHostName(getHostName());
			return user;
		})
		.findFirst()
		.orElse(null);
	}
	
	public static String getHostName() {
		String host = "";
		try {
			InetAddress remoteHost = InetAddress.getLocalHost();
			host = remoteHost.toString();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		return host.split("/")[1];
	}
	
}
