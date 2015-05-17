package edu.mum.mscrum.repository;

import java.util.List;

import edu.mum.mscrum.model.ProductBacklog;

public interface IProductBacklogRepository {

	public abstract ProductBacklog getProductBacklogByName(String productName);

	public abstract ProductBacklog getProductBacklogById(long producId);

	public abstract List<ProductBacklog> getAllProductBacklogs();

	public abstract void save(ProductBacklog ProductBacklog);

	public abstract void update(ProductBacklog ProductBacklog);

	public abstract void delete(long ProductBacklogId);

}