package com.mumscrum.model;

public class Developer extends Employee {
	
	private String catagory; // front end, back end
	
	private String technology;  // javaEE , spring , .NET

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	
	

}
