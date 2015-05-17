package edu.mum.mscrum.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.mum.mscrum.model.ProductBacklog;

public class ProductBacklogRepository implements IProductBacklogRepository {

	@PersistenceContext
	private EntityManager em;

	public ProductBacklog getProductBacklogByName(String productName) {

		return null;
	}

	public ProductBacklog getProductBacklogById(long producId) {

		return null;
	}

	public List<ProductBacklog> getAllProductBacklogs() {

		return null;
	}

	public void save(ProductBacklog ProductBacklog) {

		em.persist(ProductBacklog);

		em.flush();

	}

	public void update(ProductBacklog ProductBacklog) {

		em.merge(ProductBacklog);

	}

	public void delete(long ProductBacklogId) {

		ProductBacklog rootEntity = em.getReference(ProductBacklog.class, ProductBacklogId);

		em.remove(rootEntity);

		em.flush();

	}
}
