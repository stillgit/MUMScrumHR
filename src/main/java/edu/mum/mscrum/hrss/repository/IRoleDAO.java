package edu.mum.mscrum.hrss.repository;

import edu.mum.mscrum.hrss.model.Role;

public interface IRoleDAO {

	Role getRoleByName(String roleName);

	void save(Role role);
	
	
}
