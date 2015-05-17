package edu.mum.mscrum.hrss.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
		
		List<Role> availableRoles = findAllAvailableRoles();
		
		List<String> roleNames = new ArrayList<String>();
		
		for(Role role:availableRoles){
		roleNames.add(role.getRoleName());
		}
		model.addAttribute("roleNames", roleNames);
		
		return "addEmployee";
	}
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String enterEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult result) {
		
		System.out.println("result has errors: " + result.hasErrors());
		
		System.out.println("employee is set: " + employee.getFirstName());

		System.out.println("employee is set: " + employee.getActivity());

		System.out.println("employee is set: " + employee.getRoleNames());
		
		if(result.hasErrors()) {
			return "addEmployee";
		}
		else{
			
			System.out.println("***************** employee type***************" + employee.getActivity());
			System.out.println("################ employee roles  #############" + employee.getRoleNames().length);
			System.out.println("################ employee id  #############" + employee.getId());
			
			
			employeeService.save(employee);
		}
		
		return "success";
	}
	
	@RequestMapping(value = "/getEmployees", method = RequestMethod.GET)
	public String allEmployees(Model model) {
		
        List<Employee> employees = employeeService.findAllEmployees();
		
		model.addAttribute("employees", employees);
		
		return "getEmployees";
	}
	
	@RequestMapping(value = "/availableRoles", method = RequestMethod.GET)
	public @ResponseBody List<Role> findAllAvailableRoles(){
		
		return employeeService.getAllAvailableRoles();
		
	}
	
	
	@RequestMapping( value="/deleteEmployee/{id}", method = RequestMethod.GET)
	public String delEmployee(@PathVariable long id , Model model){
	
		employeeService.deleteEmployee(id);
		
		return "redirect:/getEmployees.html";
		
	}
	
	
	@RequestMapping( value="/editEmployee/{id}", method = RequestMethod.GET)
	public String updateEmployee(@PathVariable long id, HttpSession empSession){
		
		Employee emp = employeeService.getEmployeeById(id);
		
		empSession.setAttribute("currentEmployee", emp);
		
		System.out.println("*************** the employee in the session ********"+ emp.getFirstName());
		
		return "redirect:/employeeDetail.html";
		
	}
	
	@RequestMapping( value="/employeeDetail", method = RequestMethod.GET)
	public String goToEmployeeDetails(@ModelAttribute("employee") Employee emp,Model model, HttpSession empSession ){
		
		Employee emp2 = (Employee) empSession.getAttribute("currentEmployee");
		
		model.addAttribute("employee", empSession.getAttribute("currentEmployee"));
		
		System.out.println("*************** the employee in the model attribute ********"+ emp2.getFirstName());
		
		List<String> empTypeNames = new ArrayList<String>();
	    empTypeNames.add("ProjectManager");
	    empTypeNames.add("ScrumMaster");
	    empTypeNames.add("Developer");
	    empTypeNames.add("Tester");
	    
		model.addAttribute("empTypeNames", empTypeNames);
		
		List<Role> availableRoles = findAllAvailableRoles();
		
		List<String> roleNames = new ArrayList<String>();
		
		for(Role role:availableRoles){
		roleNames.add(role.getRoleName());
		}
		model.addAttribute("roleNames", roleNames);
		
		return "employeeDetails";
		
	}
	
	@RequestMapping(value = "/update" , method = RequestMethod.POST)
	public String afterEditing(@Valid @ModelAttribute("employee") Employee emp , BindingResult result, HttpSession empSession){
		
		Employee oldEmployee = (Employee) empSession.getAttribute("currentEmployee");
		
		System.out.println("Binding Result has errors :"+ result.hasErrors());
		
		System.out.println("Employee Updated first name : " + emp.getFirstName() );
		
		System.out.println("Employee Updated last name: " + emp.getLastName() );
		
		System.out.println("Employee id: " + emp.getId() );
		
		if(result.hasErrors()){
			return "employeeDetails";
		}
		else{
			emp.setId(oldEmployee.getId());
			employeeService.updateEmployee(emp);
		}
		
		return "redirect:/getEmployees.html";
	}
	
	
	
	
}
