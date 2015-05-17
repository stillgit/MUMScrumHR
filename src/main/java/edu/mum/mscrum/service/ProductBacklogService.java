package edu.mum.mscrum.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import edu.mum.mscrum.model.ProductBacklog;
import edu.mum.mscrum.repository.IProductBacklogDAO;

//@Service
public class ProductBacklogService implements IProductBacklogService{
	
	//@Autowired
	private IProductBacklogDAO productBacklogDAO;

	
	
	


	public void setProductBacklogDAO(IProductBacklogDAO productBacklogDAO) {
		this.productBacklogDAO = productBacklogDAO;
	}

	@Transactional
	public List<String> getAllAvailableProductCategory() {
			
		return productBacklogDAO.getAllAvailableProductCategory();
	}

	@Transactional
	public ProductBacklog save(ProductBacklog productBacklog) {
		
		productBacklogDAO.save(productBacklog);
		return productBacklog;
	}
	
	@Transactional
	public List<ProductBacklog> getAllProductBacklogs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<ProductBacklog> getAllProductBacklogByProjectManager() {
	
		return productBacklogDAO.getAllProductBacklogByProjectManager();
	}

	@Transactional
	public void deleteProductBacklog(long id) {
		
		productBacklogDAO.deleteProductBacklog(id);
	}

	public ProductBacklog getProductBacklogId(long id) {
		
		return productBacklogDAO.getProductBacklogId(id);
	}

	public void updateProductBacklog(ProductBacklog pro) {
	
		productBacklogDAO.updateProductBacklog(pro);
		
	}

}
