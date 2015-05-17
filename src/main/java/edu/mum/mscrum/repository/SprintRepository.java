package edu.mum.mscrum.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.mum.mscrum.model.Sprint;

public class SprintRepository implements ISprintRepository {

	@PersistenceContext
	private EntityManager em;
	

	public Sprint getSprintByName(String SprintName) {
		
		return null;
	}
	
    
	public Sprint getSprintById(long SprintId) {
		
		return null;
	}
	
	
	public List<Sprint> getAllSprints(){
		
		return null;
	}

	public void save(Sprint Sprint) {
		
		em.persist(Sprint);

		em.flush();
	
	}
	

	public void update(Sprint Sprint) {
		
		em.merge(Sprint);
		
	}

    public void delete(long SprintId) {
		
        Sprint rootEntity = em.getReference(Sprint.class, SprintId);
		
		em.remove(rootEntity);
		
		em.flush();
		
	}
	
	
}
