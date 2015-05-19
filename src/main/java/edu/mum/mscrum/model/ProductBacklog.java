package edu.mum.mscrum.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ProductBacklog {

	@Id
	@GeneratedValue
	private long id;
	private String productName;
	private String category;
	private String status;
	private Date startDate;
	private Date endDate;
	
	@OneToMany(mappedBy="productBacklog", cascade=CascadeType.ALL )
	private List<UserStory> userStories =new ArrayList<UserStory>();
	
	@OneToOne
	private WorkLog workLog;
	

	public String getCategory() {
		return category;
	}

	public Date getEndDate() {
		return endDate;
	}

	public long getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public String getStatus() {
		return status;
	}

	public List<UserStory> getUserStories() {
		return userStories;
	}

	public WorkLog getWorkLog() {
		return workLog;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setUserStories(List<UserStory> userStories) {
		this.userStories = userStories;
	}

	public void setWorkLog(WorkLog workLog) {
		this.workLog = workLog;
	}

	
}
