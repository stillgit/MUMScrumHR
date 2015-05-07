package edu.mum.mscrum.hrss.service;

import java.util.List;

import edu.mum.mscrum.hrss.model.Employee;
import edu.mum.mscrum.hrss.model.Role;

public interface IEmpFactory {
	
	Employee createEmployee(String position, List<Role> roles);

}
