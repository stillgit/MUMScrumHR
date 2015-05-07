package edu.mum.mscrum.hrss.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mum.mscrum.hrss.model.Developer;
import edu.mum.mscrum.hrss.model.Employee;
import edu.mum.mscrum.hrss.model.Role;

@Service
public class EmpFactoryImpl implements IEmpFactory {

	public Employee createEmployee(String position, List<Role> roles) {
//
//		if(position=="ProjectManager"){
//			
//			Employee pm = new ProjectManager();
//			for(Role role:roles){
//				pm.getRoles().add(role);
//			}
//			
//			return pm;
//		}
//		if(position=="ScrumMaster"){
//			
//			Employee sm = new ScrumMaster();
//			for(Role role:roles){
//			sm.getRoles().add(role);
//			}
//			
//			return sm;
//		}		
		if(position=="Developer"){
			
			Employee dev = new Developer();
			for(Role role:roles){
			dev.getRoles().add(role);
			}
			
			return dev;
		}
//		if(position=="Tester"){
//			
//			Employee ts = new Tester();
//			for(Role role:roles){
//			ts.getRoles().add(role);
//			}
//			
//			return ts;
//		}
		
		return null;
	}

}
