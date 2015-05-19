package edu.mum.mscrum.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.mum.mscrum.model.ProductBacklog;

@Repository
public class ProductBacklogDAO implements IProductBacklogDAO{
	
	@PersistenceContext(type=PersistenceContextType.TRANSACTION)
	private EntityManager em;
	


	public List<String> getAllAvailableProductCategory() {
		// hard coded list of category, we can get this from database 
		List<String> categoryTypes = new ArrayList<String>();
		categoryTypes.add("Exploration Projects");
		categoryTypes.add("Service Pilot Projects");
		categoryTypes.add("New Service Projects");
		categoryTypes.add("Service Change Projects");
		categoryTypes.add("Organizational Development Projects");
		categoryTypes.add("Software Development Projects");
		categoryTypes.add("System Deployment Projects");
		return categoryTypes;
	}

	
	public ProductBacklog save(ProductBacklog productBacklog) {
		
		em.persist(productBacklog);
		em.flush();
		return productBacklog;
	}



	public List<ProductBacklog> getAllProductBacklogs() {
		// TODO Auto-generated method stub
		return null;
	}


	public List<ProductBacklog> getAllProductBacklogByProjectManager() {
		Query query = em.createQuery("select p from ProductBacklog p");

		@SuppressWarnings("unchecked")
		List<ProductBacklog> productBacklogs = query.getResultList();

		return productBacklogs;
		
	}


	public void deleteProductBacklog(long id) {
		
    ProductBacklog rootEntity = em.getReference(ProductBacklog.class, id);
		
		System.out.println("**************" + rootEntity.getProductName());
		
		em.remove(rootEntity);
		
		em.flush();
		
	}


	public ProductBacklog getProductBacklogId(long id) {
		
		return em.getReference(ProductBacklog.class, id);
	}


	public void updateProductBacklog(ProductBacklog pro) {
		
		em.merge(pro);
		
		
	}


}
