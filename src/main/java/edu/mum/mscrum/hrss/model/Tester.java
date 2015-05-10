package edu.mum.mscrum.hrss.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Tester extends Employee {

	
	private String testCatagory;
	private String testTechnology;
	
	
	public Tester() {
	}


	public Tester(String testCatagory, String testTechnology) {
		super();
		this.testCatagory = testCatagory;
		this.testTechnology = testTechnology;
	}


	public String getTestCatagory() {
		return testCatagory;
	}


	public void setTestCatagory(String testCatagory) {
		this.testCatagory = testCatagory;
	}


	public String getTestTechnology() {
		return testTechnology;
	}


	public void setTestTechnology(String testTechnology) {
		this.testTechnology = testTechnology;
	}
	
	
	
	
}
