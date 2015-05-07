package com.mumscrum.repository;

import java.util.List;

import com.mumscrum.model.Employee;
import com.mumscrum.model.Role;

public interface IEmployeeDAO {

	Employee save (Employee employee);
	
	List<Employee> getAllEmployee();

	List<Role> getAllAvailableRoles();
	
}