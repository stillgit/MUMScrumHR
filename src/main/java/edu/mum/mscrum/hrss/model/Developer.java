package edu.mum.mscrum.hrss.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Developer extends Employee {
	
	private String catagory; // front end, back end
	
	private String technology;  // javaEE , spring , .NET

	
	public Developer() {
	}

	public Developer(String catagory, String technology) {
		super();
		this.catagory = catagory;
		this.technology = technology;
	}

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
