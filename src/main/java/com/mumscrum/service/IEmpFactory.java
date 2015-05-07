package com.mumscrum.service;

import java.util.List;

import com.mumscrum.model.Employee;
import com.mumscrum.model.Role;

public interface IEmpFactory {
	
	Employee createEmployee(String position, List<Role> roles);

}
