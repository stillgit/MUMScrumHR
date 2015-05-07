package com.mumscrum.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String firstName;

	private String lastName;
	
	@OneToMany(mappedBy="employee", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Role> roles;


	public String getFirstName() {
		return firstName;
		
	}

	public long getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}
	
	public List<Role> getRoles() {
		return roles;
	}
	

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
}