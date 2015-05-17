package edu.mum.mscrum.repository;

import java.util.List;

import edu.mum.mscrum.model.Sprint;

public interface ISprintRepository {

	public abstract Sprint getSprintByName(String SprintName);

	public abstract Sprint getSprintById(long SprintId);

	public abstract List<Sprint> getAllSprints();

	public abstract void save(Sprint Sprint);

	public abstract void update(Sprint Sprint);

	public abstract void delete(long SprintId);

}