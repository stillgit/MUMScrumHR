package edu.mum.mscrum.service;

import java.util.List;

import edu.mum.mscrum.model.UserStory;

public interface IUserStoryService {

	public abstract UserStory save(UserStory userStory);

	public abstract List<UserStory> getAllUserStories();

	public abstract void deleteUserStory(long id);

	public abstract UserStory getUserStoryById(long id);

	public abstract void updateUserStory(UserStory userStory);

	public abstract List<UserStory> allUserStoryByProductBacklog(long productId);

}