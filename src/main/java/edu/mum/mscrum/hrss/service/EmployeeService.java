package edu.mum.mscrum.hrss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.mscrum.hrss.model.Employee;
import edu.mum.mscrum.hrss.model.Role;
import edu.mum.mscrum.hrss.repository.IEmployeeDAO;

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
