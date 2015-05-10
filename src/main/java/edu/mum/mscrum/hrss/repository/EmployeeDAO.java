package edu.mum.mscrum.hrss.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.mum.mscrum.hrss.model.Employee;
import edu.mum.mscrum.hrss.model.Role;

@Repository("employeeDAO")
public class EmployeeDAO implements IEmployeeDAO {

	@PersistenceContext
	private EntityManager em;

	public Employee save(Employee employee) {

		em.persist(employee);

		em.flush();

		return employee;
	}

	public List<Employee> getAllEmployee() {

		Query query = em.createQuery("select e from Employee e");

		@SuppressWarnings("unchecked")
		List<Employee> employees = query.getResultList();

		return employees;
	}

	public List<Role> getAllAvailableRoles() {
		// hard coded for the time being.
		List<Role> roles = new ArrayList<Role>();

		Role pm = new Role();
		pm.setRoleName("Project Manager");
		roles.add(pm);

		Role sm = new Role();
		sm.setRoleName("Scrum Master");
		roles.add(sm);

		Role dev = new Role();
		dev.setRoleName("Developer");
		roles.add(dev);

		Role ts = new Role();
		ts.setRoleName("Tester");
		roles.add(ts);

		return roles;
	}

	public void deleteEmployee(long id) {
		
		Employee rootEntity = em.getReference(Employee.class, id);
		
		System.out.println("**************" + rootEntity.getFirstName());
		
		em.remove(rootEntity);
		
		em.flush();

	}

	public Employee getEmployeeById(long id) {
		
		return em.getReference(Employee.class, id);
	
	}

	public void updateEmployee(Employee emp) {

		
		Employee employee = em.find(Employee.class, emp.getId()); 
		
		employee.setFirstName(emp.getFirstName());
		employee.setLastName(emp.getLastName());
		
		em.persist(employee);
		em.flush();
		
		
	}

}
