package edu.mum.mscrum.hrss.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import edu.mum.mscrum.hrss.model.Role;

@Repository
public class RoleDAO implements IRoleDAO {
	
	@PersistenceContext
	private EntityManager em;

	public Role getRoleByName(String roleName) {
		return em.createQuery(
			    "from Role where roleName = :roleName", Role.class
			   ).setParameter("roleName", roleName).getSingleResult();
	}

	public void save(Role role) {
		
		em.persist(role);

		em.flush();
	
	}

}
