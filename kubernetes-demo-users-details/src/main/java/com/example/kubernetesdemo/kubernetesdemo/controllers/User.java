package com.example.kubernetesdemo.kubernetesdemo.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User  {
	
	private Integer id;
	private String name;
	private String reportsTo;
	private Double experience;
	private List<String> skills;
	private String hostName;

	public User(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public User(Integer id, String name, String reportsTo, Double experience, List<String> skills) {
		super();
		this.id = id;
		this.name = name;
		this.reportsTo = reportsTo;
		this.experience = experience;
		this.skills = skills;
	}



	public Integer getId() {
		return id;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public String getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(String reportsTo) {
		this.reportsTo = reportsTo;
	}

	public Double getExperience() {
		return experience;
	}

	public void setExperience(Double experience) {
		this.experience = experience;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	public String getHostName() {
		return hostName;
	}


	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", reportsTo=" + reportsTo + ", experience=" + experience
				+ ", skills=" + skills + "]";
	}


	public static List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		
		users.add(new User(1001, "Hitesh","Varun Airi", 7.8, Arrays.asList("Java","Kubenetes","Kafka")));
		users.add(new User(1002, "Dheeraj","Hitesh Ahuja", 4D, Arrays.asList("Node","Angular")));
		users.add(new User(1003, "Akash","Dheeraj", 5D, Arrays.asList("Node")));
		users.add(new User(1004, "Karan","Varun Airi", 7D, Arrays.asList("Angular")));
		users.add(new User(1004, "Gaurav","Varun Airi", 6D, Arrays.asList("Machine Learning")));
		
		return users;
	}
}