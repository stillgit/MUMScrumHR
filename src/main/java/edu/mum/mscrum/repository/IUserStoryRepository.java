package edu.mum.mscrum.repository;

import java.util.List;

import edu.mum.mscrum.model.UserStory;

public interface IUserStoryRepository {

	public abstract UserStory getUserStoryByName(String UserStoryName);

	public abstract UserStory getUserStoryById(long UserStoryId);

	public abstract List<UserStory> getAllUserStorys();

	public abstract void save(UserStory UserStory);

	public abstract void update(UserStory UserStory);

	public abstract void delete(long UserStoryId);

}