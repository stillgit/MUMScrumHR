package edu.mum.mscrum.hrss.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.mscrum.hrss.model.Employee;
import edu.mum.mscrum.hrss.model.Role;
import edu.mum.mscrum.hrss.repository.IEmployeeDAO;
import edu.mum.mscrum.hrss.repository.IRoleDAO;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private IEmployeeDAO employeeDAO;
	
	@Autowired 
	private IRoleDAO roleDAO;
	
	@Autowired
	private IEmpFactory employeeFactory;
	
	@Transactional
	public Employee save(Employee employee) {
		
		List<Role> roles = new ArrayList<Role>();
		
		// getting all the existing roles from the database
		for(int i=0; i < employee.getRoleNames().length; i++){
			
			roles.add(roleDAO.getRoleByName(employee.getRoleNames()[i]));
			
			System.out.println("roles from the database "+ employee.getRoleNames()[i]);
			
		}
		
//		Employee finalEmployee = employeeFactory.createEmployee(employee , roles );
		
		employee.setRoles(roles);

		return employeeDAO.save(employee);
	
	}

	@Transactional
	public List<Employee> findAllEmployees() {
		
		return employeeDAO.getAllEmployee();
	}

	@Transactional
	public List<Role> getAllAvailableRoles() {
		
		return employeeDAO.getAllAvailableRoles();
	}

	@Transactional
	public void deleteEmployee(long id) {
		 
		employeeDAO.deleteEmployee(id);
	}
	
	@Transactional
	public Employee getEmployeeById(long id) {
		
		return employeeDAO.getEmployeeById(id);
	}

	@Transactional
	public void updateEmployee(Employee emp) {
		
        List<Role> roles = new ArrayList<Role>();
		
		// getting all the existing roles from the database
		for(int i=0; i < emp.getRoleNames().length; i++){
			
			roles.add(roleDAO.getRoleByName(emp.getRoleNames()[i]));
			
			System.out.println("roles from the database "+ emp.getRoleNames()[i]);
			
		}
		
//		Employee finalEmployee = employeeFactory.createEmployee(employee , roles );
		
		emp.setRoles(roles);

		employeeDAO.updateEmployee(emp);
	}

}
