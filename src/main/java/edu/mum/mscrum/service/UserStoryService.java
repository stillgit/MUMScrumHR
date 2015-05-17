package edu.mum.mscrum.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import edu.mum.mscrum.model.UserStory;
import edu.mum.mscrum.repository.IUserStoryDAO;

public class UserStoryService implements IUserStoryService {
	
	private IUserStoryDAO productBacklogDao;

	public void setProductBacklogDao(IUserStoryDAO productBacklogDao) {
		this.productBacklogDao = productBacklogDao;
	}

	@Transactional
	public UserStory save(UserStory userStory) {

		productBacklogDao.save(userStory);
		return userStory;
	}

	@Transactional
	public List<UserStory> getAllUserStories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void deleteUserStory(long id) {
		productBacklogDao.deleteUserStory(id);
		
	}

	@Transactional
	public UserStory getUserStoryById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void updateUserStory(UserStory userStory) {
		// TODO Auto-generated method stub
		
	}

	public List<UserStory> allUserStoryByProductBacklog(long productId) {
		
		return productBacklogDao.allUserStoryByProductBacklog(productId);
	}
	
	

}
