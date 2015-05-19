package edu.mum.mscrum.repository;

import java.util.List;

import edu.mum.mscrum.model.ProductBacklog;

public interface IProductBacklogDAO {

	public abstract List<String> getAllAvailableProductCategory();

	public abstract ProductBacklog save(ProductBacklog productBacklog);

	public abstract List<ProductBacklog> getAllProductBacklogs();

	public abstract List<ProductBacklog> getAllProductBacklogByProjectManager();

	public abstract void deleteProductBacklog(long id);

	public abstract ProductBacklog getProductBacklogId(long id);

	public abstract void updateProductBacklog(ProductBacklog pro);

}