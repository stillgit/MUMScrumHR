package edu.mum.mscrum.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Sprint{
	
	@Id
	@GeneratedValue
	private long id;
	
	private String sprintName;

	@ManyToOne
	private Release release;
	
	@OneToMany
	private List<UserStory> sprintUserStories = new ArrayList<UserStory>();
	

	public long getId() {
		return id;
	}

	public Release getRelease() {
		return release;
	}

	public String getSprintName() {
		return sprintName;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setRelease(Release release) {
		this.release = release;
	}

	public void setSprintName(String sprintName) {
		this.sprintName = sprintName;
	}
	
	
}
