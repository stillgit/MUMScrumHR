package edu.mum.mscrum.hrss.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Role {
	@Id
	@GeneratedValue
	private long id;
	
	private String roleName;
	
	@ManyToOne
	private Employee employee;

	
	public Employee getEmployee() {
		return employee;
	}

	public long getId() {
		return id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	

}
