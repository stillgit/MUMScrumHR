package edu.mum.mscrum.repository;

import java.util.List;

import edu.mum.mscrum.model.ProductBacklog;

public interface IProductBacklogDAO {
	List<String> getAllAvailableProductCategory();
    ProductBacklog save (ProductBacklog productBacklog);
	List<ProductBacklog> getAllProductBacklogs();
	List<ProductBacklog> getAllProductBacklogByProjectManager();
	void deleteProductBacklog(long id);
	ProductBacklog getProductBacklogId(long id);
	void updateProductBacklog(ProductBacklog pro);
	

}
