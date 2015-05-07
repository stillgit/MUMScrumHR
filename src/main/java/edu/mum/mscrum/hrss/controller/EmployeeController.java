package edu.mum.mscrum.hrss.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.mum.mscrum.hrss.model.Employee;
import edu.mum.mscrum.hrss.model.Role;
import edu.mum.mscrum.hrss.service.IEmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
	public String addGoal(@ModelAttribute("employee") Employee employee, Model model) {
	    
		List<String> empTypeNames = new ArrayList<String>();
	    empTypeNames.add("Project Manager");
	    empTypeNames.add("Scrum Master");
	    empTypeNames.add("Developer");
	    empTypeNames.add("Tester");
	    
		model.addAttribute("empTypeNames", empTypeNames);
		
		List<String> roleNames = new ArrayList<String>();
		roleNames.add("Project Manager");
		roleNames.add("Scrum Master");
		roleNames.add("Developer");
		roleNames.add("Tester");
		
		model.addAttribute("roleNames", roleNames);
		
		return "addEmployee";
	}
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String updateEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult result) {
		
		System.out.println("result has errors: " + result.hasErrors());
		
		System.out.println("employee is set: " + employee.getFirstName());
		
		if(result.hasErrors()) {
			return "addEmployee";
		}
		else{
			employeeService.save(employee);
		}
		
		return "success";
	}
	
	@RequestMapping(value = "getEmployees", method = RequestMethod.GET)
	public String allEmployees(Model model) {
		
        List<Employee> employees = employeeService.findAllEmployees();
		
		model.addAttribute("employees", employees);
		
		return "getEmployees";
	}
	
	@RequestMapping(value = "/availableRoles", method = RequestMethod.GET)
	public @ResponseBody List<Role> findAllAvailableRoles(){
		
		return employeeService.getAllAvailableRoles();
		
	}
}
