package edu.mum.mscrum.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProductBacklog {
	
	@Id
	@GeneratedValue
//	@Column(name = "PRODUCTBACKLOG_ID")
	private long id;
	private String productName;
	private String category;
	private String status;
	private Date startDate;
	private Date endDate;
	//private double budget;
	//private Employee projectManager;
	
//	@OneToMany(cascade ={ CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "PRODUCTBACKLOG_USERSTORY",
//            joinColumns = @JoinColumn(name = "productBacklog_id"),
//            inverseJoinColumns = @JoinColumn(name = "userStories_id"))
//	
//	private List<UserStory> userStories =new ArrayList<UserStory>();
//	
	
	
	
	
//	public List<UserStory> getUserStories() {
//		return userStories;
//	}
//	public void setUserStories(List<UserStory> userStories) {
//		this.userStories = userStories;
//	}
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
//	public Employee getProjectManager() {
//		return projectManager;
//	}
//	public void setProjectManager(Employee projectManager) {
//		this.projectManager = projectManager;
//	}

//	public void addUserStory(UserStory userStory){
//		userStories.add(userStory);
//	}
	


}
