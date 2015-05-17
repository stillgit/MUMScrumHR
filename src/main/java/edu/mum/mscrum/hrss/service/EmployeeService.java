package edu.mum.mscrum.hrss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.mscrum.hrss.model.Employee;
import edu.mum.mscrum.hrss.model.Role;
import edu.mum.mscrum.hrss.repository.EmployeeDAO;

//@Service
public class EmployeeService implements IEmployeeService {

	//@Autowired
	private EmployeeDAO employeeDao;
	
	public void setEmployeeDao(EmployeeDAO employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Transactional
	public Employee save(Employee employee) {

		return employeeDao.save(employee);
	
	}

	@Transactional
	public List<Employee> findAllEmployees() {
		
		return employeeDao.getAllEmployee();
	}

	@Transactional
	public List<Role> getAllAvailableRoles() {
		
		return employeeDao.getAllAvailableRoles();
	}

	@Transactional
	public void deleteEmployee(long id) {
		 
		employeeDao.deleteEmployee(id);
	}
	
	@Transactional
	public Employee getEmployeeById(long id) {
		
		return employeeDao.getEmployeeById(id);
	}

	@Transactional
	public void updateEmployee(Employee emp) {

		employeeDao.updateEmployee(emp);
	}

}
