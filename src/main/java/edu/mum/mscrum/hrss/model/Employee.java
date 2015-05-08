package edu.mum.mscrum.hrss.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String firstName;

	private String lastName;
	
	@NotEmpty
	private String activity;
	
	@NotEmpty
	private String[] rolenames;
	
	@OneToMany(mappedBy="employee", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Role> roles;

	public String getActivity() {
		return activity;
	}

	public String getFirstName() {
		return firstName;
		
	}

	public long getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}


	public String[] getRolenames() {
		return rolenames;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setActivity(String activity) {
		this.activity = activity;
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

	public void setRolenames(String[] rolenames) {
		this.rolenames = rolenames;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
}