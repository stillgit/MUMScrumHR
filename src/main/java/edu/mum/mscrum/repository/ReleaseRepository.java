package edu.mum.mscrum.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.mum.mscrum.model.Release;

public class ReleaseRepository implements IReleaseRepository {

	@PersistenceContext
	private EntityManager em;
	

	public Release getReleaseByName(String releaseName) {
		
		return null;
	}
	
    
	public Release getReleaseById(long releaseId) {
		
		return null;
	}
	
	
	public List<Release> getAllReleases(){
		
		return null;
	}

	public void save(Release release) {
		
		em.persist(release);

		em.flush();
	
	}
	

	public void update(Release release) {
		
		em.merge(release);
		
	}

    public void delete(long releaseId) {
		
        Release rootEntity = em.getReference(Release.class, releaseId);
		
		em.remove(rootEntity);
		
		em.flush();
		
	}
	
}
