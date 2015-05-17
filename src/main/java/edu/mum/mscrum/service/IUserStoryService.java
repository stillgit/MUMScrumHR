package edu.mum.mscrum.service;

import java.util.List;

import edu.mum.mscrum.model.UserStory;

public interface IUserStoryService {
	
    
	UserStory save (UserStory userStory);
	List<UserStory> getAllUserStories();
	void deleteUserStory(long id);
	UserStory getUserStoryById(long id);
	void updateUserStory(UserStory userStory);
	List<UserStory>allUserStoryByProductBacklog(long productId);
	

}
