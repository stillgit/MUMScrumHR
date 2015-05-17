package edu.mum.mscrum.hrss.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Role {
	@Id
	@GeneratedValue
	private long id;
	
	private String roleName;
	
	@ManyToMany
	private List<Employee> employees = new ArrayList<Employee>();
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public long getId() {
		return id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}


	public void setId(long id) {
		this.id = id;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	

}
