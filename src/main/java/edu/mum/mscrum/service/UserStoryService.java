package edu.mum.mscrum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.mscrum.model.UserStory;
import edu.mum.mscrum.repository.IUserStoryDAO;

@Service
public class UserStoryService implements IUserStoryService {
	
	@Autowired
	private IUserStoryDAO userStoryDAO;

	
	@Transactional
	public UserStory save(UserStory userStory) {

		userStoryDAO.save(userStory);
		return userStory;
	}

	@Transactional
	public List<UserStory> getAllUserStories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void deleteUserStory(long id) {
		
		userStoryDAO.deleteUserStory(id);
		
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

	@Transactional
	public List<UserStory> allUserStoryByProductBacklog(long productId) {
		
		return userStoryDAO.allUserStoryByProductBacklog(productId);
	}
	
	


}
