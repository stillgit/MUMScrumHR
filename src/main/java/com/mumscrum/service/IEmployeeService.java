package com.mumscrum.service;

import java.util.List;

import com.mumscrum.model.Employee;
import com.mumscrum.model.Role;

public interface IEmployeeService {

	List<Employee> findAllEmployees();

	Employee save(Employee employee);

	List<Role> getAllAvailableRoles();
	
}