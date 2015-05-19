package edu.mum.mscrum.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class WorkLog {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String workLogName;
	
	@OneToOne
	private UserStory userStory;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getWorkLogName() {
		return workLogName;
	}

	public void setWorkLogName(String workLogName) {
		this.workLogName = workLogName;
	}

	public UserStory getUserStory() {
		return userStory;
	}

	public void setUserStory(UserStory userStory) {
		this.userStory = userStory;
	}
	
	

}
