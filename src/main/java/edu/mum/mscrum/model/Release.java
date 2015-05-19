package edu.mum.mscrum.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Release {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String releaseName;
	
	@ManyToOne
	private ProductBacklog productBacklog;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="release")
	private List<Sprint> sprints = new ArrayList<Sprint>();
	
	@OneToMany
	private List<UserStory> releaseUserStories = new ArrayList<UserStory>();
	

	public long getId() {
		return id;
	}

	public ProductBacklog getProductBacklog() {
		return productBacklog;
	}

	public String getReleaseName() {
		return releaseName;
	}

	public List<UserStory> getReleaseUserStories() {
		return releaseUserStories;
	}

	public List<Sprint> getSprints() {
		return sprints;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setProductBacklog(ProductBacklog productBacklog) {
		this.productBacklog = productBacklog;
	}

	public void setReleaseName(String releaseName) {
		this.releaseName = releaseName;
	}

	public void setReleaseUserStories(List<UserStory> releaseUserStories) {
		this.releaseUserStories = releaseUserStories;
	}

	public void setSprints(List<Sprint> sprints) {
		this.sprints = sprints;
	}


}
