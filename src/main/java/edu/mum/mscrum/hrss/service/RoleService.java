package edu.mum.mscrum.hrss.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.mscrum.hrss.model.Role;
import edu.mum.mscrum.hrss.repository.IRoleDAO;

@Service
public class RoleService implements IRoleService {

	@Autowired
	private IRoleDAO roleDAO;
	
	@Transactional
	public void save(Role role) {

		roleDAO.save(role);

	}

}
