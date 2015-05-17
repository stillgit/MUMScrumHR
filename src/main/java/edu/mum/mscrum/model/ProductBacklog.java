package edu.mum.mscrum.model;

<<<<<<< HEAD
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
	//private double budget;
	//private ProjectManager projectManager;
	@OneToMany(mappedBy= "productBacklog")
	private List<UserStory> userStories;
	
	
	
	
	
	public List<UserStory> getUserStories() {
		return userStories;
	}
	public void setUserStories(List<UserStory> userStories) {
		this.userStories = userStories;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
//	public double getBudget() {
//		return budget;
//	}
//	public void setBudget(double budget) {
//		this.budget = budget;
//	}
//	public ProjectManager getProjectManager() {
//		return projectManager;
//	}
//	public void setProjectManager(ProjectManager projectManager) {
//		this.projectManager = projectManager;
//	}
	
	
	
=======
public class ProductBacklog {
>>>>>>> branch 'master' of https://github.com/stillgit/MUMScrumHR.git

}
