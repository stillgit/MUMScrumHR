package edu.mum.mscrum.hrss.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.mscrum.hrss.model.Role;
import edu.mum.mscrum.hrss.service.IRoleService;

@Controller
public class RoleController {

	@Autowired
	private IRoleService roleService;
	
	@RequestMapping(value="/addRole" , method = RequestMethod.GET)
	public String goToAddRolePage(@ModelAttribute("role") Role role ,Model model){
	
			return "addRole";
		
	}
	
	@RequestMapping(value = "/addRole", method = RequestMethod.POST)
	public String addRole(@Valid @ModelAttribute("role") Role role, BindingResult result) {
		
		System.out.println("adding role result has errors: " + result.hasErrors());
		
		if(result.hasErrors()) {
			return "addRole";
		}
		else{
			
			roleService.save(role);
		
		}
		
		return "success";
	}
	
}
