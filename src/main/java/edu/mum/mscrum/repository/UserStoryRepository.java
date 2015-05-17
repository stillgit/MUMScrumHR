package edu.mum.mscrum.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.mum.mscrum.model.UserStory;

public class UserStoryRepository implements IUserStoryRepository {

	@PersistenceContext
	private EntityManager em;
	

	public UserStory getUserStoryByName(String UserStoryName) {
		
		return null;
	}
	
    
	public UserStory getUserStoryById(long UserStoryId) {
		
		return null;
	}
	
	
	public List<UserStory> getAllUserStorys(){
		
		return null;
	}

	public void save(UserStory UserStory) {
		
		em.persist(UserStory);

		em.flush();
	
	}
	

	public void update(UserStory UserStory) {
		
		em.merge(UserStory);
		
	}

    public void delete(long UserStoryId) {
		
        UserStory rootEntity = em.getReference(UserStory.class, UserStoryId);
		
		em.remove(rootEntity);
		
		em.flush();
		
	}
	
	
}
