package edu.mum.mscrum.hrss.service;

import java.util.List;

import edu.mum.mscrum.hrss.model.Employee;
import edu.mum.mscrum.hrss.model.Role;

public interface IEmployeeService {

	List<Employee> findAllEmployees();

	Employee save(Employee employee);

	List<Role> getAllAvailableRoles();

	void deleteEmployee(long id);

	Employee getEmployeeById(long id);

	void updateEmployee(Employee emp);
	
	
}