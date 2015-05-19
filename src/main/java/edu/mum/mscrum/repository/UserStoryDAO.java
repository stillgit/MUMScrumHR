package edu.mum.mscrum.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.mum.mscrum.model.UserStory;

@Repository
public class UserStoryDAO implements IUserStoryDAO {

	@PersistenceContext(type=PersistenceContextType.TRANSACTION)
	private EntityManager em;
	
	

	public UserStory save(UserStory userStory) {
		
		
//		if (!em.contains(productBacklog)) {
//			  em.persist(productBacklog);
//			  em.flush();
//			} else {
//			  em.merge(productBacklog);
//			}
		em.persist(userStory);
		em.flush();
		return userStory;
	}
	

	public List<UserStory> getAllUserStories() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteUserStory(long id) {
		 UserStory rootEntity = em.getReference(UserStory.class, id);
			
			System.out.println("**************" + rootEntity.getName());
			
			em.remove(rootEntity);
			
			em.flush();
		
	}

	public UserStory getUserStoryById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateUserStory(UserStory userStory) {
		// TODO Auto-generated method stub
		
	}

	public List<UserStory> allUserStoryByProductBacklog(long productId) {
		//Query query = em.createQuery("select p from UserStory p where p.pbProduct.id=:productid");
		Query query = em.createQuery("select p from UserStory p");
		//query.setParameter("productid", productId);

		@SuppressWarnings("unchecked")
		List<UserStory> userStories = query.getResultList();

		return userStories;
		
	}
	
	

}
