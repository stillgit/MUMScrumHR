package edu.mum.mscrum.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class UserStory {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	
   @ManyToOne
   private ProductBacklog productBacklog;
	
	//private Employee productManager;
	
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductBacklog getProductBacklog() {
		return productBacklog;
	}

	public void setProductBacklog(ProductBacklog productBacklog) {
		this.productBacklog = productBacklog;
	}

	public void setId(long id) {
		this.id = id;
	}
	
//	public Employee getProductManager() {
//		return productManager;
//	}
//	public void setProductManager(Employee productManager) {
//		this.productManager = productManager;
//	}
	
	
	public UserStory createUserStory(){
		return null;
	}
	
	public Release createRelease(){
		return null;
	}
}
