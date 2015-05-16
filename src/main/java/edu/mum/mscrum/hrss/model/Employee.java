package edu.mum.mscrum.hrss.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;



import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long id;
	
	private String firstName;

	private String lastName;
	
	@NotEmpty
	private String activity; // variable representing Employee type (Developer, tester , ... etc)
	
	@NotEmpty
	private String[] roleNames; 
	
	 @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
	 @JoinTable(name="EmployeeAndRole",
	 			joinColumns = @JoinColumn(name="employees_id"),
	            inverseJoinColumns=@JoinColumn(name="roles_id"))
	 private List<Role> roles = new ArrayList<Role>();

	public Employee() {
	}

	public Employee(String firstName, String lastName, String activity,
			String[] roleNames, List<Role> roles) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.activity = activity;
		this.roleNames = roleNames;
		this.roles = roles;
	}

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


	public String[] getRoleNames() {
		return roleNames;
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

	public void setRoleNames(String[] rolenames) {
		this.roleNames = rolenames;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
}