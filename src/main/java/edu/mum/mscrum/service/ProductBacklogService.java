package edu.mum.mscrum.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import edu.mum.mscrum.model.ProductBacklog;
import edu.mum.mscrum.repository.IProductBacklogDAO;

//@Service
public class ProductBacklogService implements IProductBacklogService{
	
	//@Autowired
	private IProductBacklogDAO productDao;

	
	
	
	public void setProductDao(IProductBacklogDAO productDao) {
		this.productDao = productDao;
	}

	@Transactional
	public List<String> getAllAvailableProductCategory() {
			
		return productDao.getAllAvailableProductCategory();
	}

	@Transactional
	public ProductBacklog save(ProductBacklog productBacklog) {
		
		productDao.save(productBacklog);
		return productBacklog;
	}
	
	@Transactional
	public List<ProductBacklog> getAllProductBacklogs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<ProductBacklog> getAllProductBacklogByProjectManager() {
	
		return productDao.getAllProductBacklogByProjectManager();
	}

	@Transactional
	public void deleteProductBacklog(long id) {
		
		productDao.deleteProductBacklog(id);
	}

	public ProductBacklog getProductBacklogId(long id) {
		
		return productDao.getProductBacklogId(id);
	}

	public void updateProductBacklog(ProductBacklog pro) {
	
		productDao.updateProductBacklog(pro);
		
	}

}