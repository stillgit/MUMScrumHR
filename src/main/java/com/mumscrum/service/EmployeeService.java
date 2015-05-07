package com.mumscrum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mumscrum.model.Employee;
import com.mumscrum.model.Role;
import com.mumscrum.repository.IEmployeeDAO;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private IEmployeeDAO employeeDAO;
	
	@Transactional
	public Employee save(Employee employee) {

		return employeeDAO.save(employee);
	
	}

	@Transactional
	public List<Employee> findAllEmployees() {
		
		return employeeDAO.getAllEmployee();
	}

	public List<Role> getAllAvailableRoles() {
		// TODO Auto-generated method stub
		return employeeDAO.getAllAvailableRoles();
	}

}
