package edu.mum.mscrum.hrss.repository;

import java.util.List;

import edu.mum.mscrum.hrss.model.Employee;
import edu.mum.mscrum.hrss.model.Role;

public interface IEmployeeDAO {

	Employee save (Employee employee);
	
	List<Employee> getAllEmployee();

	List<Role> getAllAvailableRoles();

	void deleteEmployee(long id);

	Employee getEmployeeById(long id);

	void updateEmployee(Employee emp);
	
}