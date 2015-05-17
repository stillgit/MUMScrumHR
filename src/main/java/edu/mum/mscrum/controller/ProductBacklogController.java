package edu.mum.mscrum.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.mum.mscrum.model.ProductBacklog;
import edu.mum.mscrum.service.IProductBacklogService;


@Controller
public class ProductBacklogController {
	
	@Autowired
	private IProductBacklogService productBacklogService;

	
	@RequestMapping(value = "/addProductBacklog", method = RequestMethod.GET)
	public String addProductBacklog(@ModelAttribute("productBacklog") ProductBacklog productBacklog) {
		
		return "addProductBacklog";
	}
	
	@RequestMapping(value = "/availableCategories", method = RequestMethod.GET)
	public @ResponseBody List<String> findAllAvailableCategories(){
		
		
		return productBacklogService.getAllAvailableProductCategory();
		
	}
	
	@RequestMapping(value = "/addProductBacklog", method = RequestMethod.POST)
	public String saveProductBacklog(@Valid @ModelAttribute("productBacklog") ProductBacklog productBacklog, BindingResult result) {
		
		System.out.println("result has errors: " + result.hasErrors());
		
		System.out.println("employee is set: " + productBacklog.getCategory());
		
		if(result.hasErrors()) {
			return "addProductBacklog";
		}
		else{
			productBacklogService.save(productBacklog);
		}
		
		return "productBacklogSuccess";
	}
	
	@RequestMapping(value = "/getProductBacklog", method = RequestMethod.GET)
	public String allProductBacklogByManager(Model model) {
		
        List<ProductBacklog> productBacklogs = productBacklogService.getAllProductBacklogByProjectManager();
		
		model.addAttribute("productBacklogs", productBacklogs);
		
		return "getProductBacklogs";
	}
	
	@RequestMapping( value="/deleteProductBacklog/{id}", method = RequestMethod.GET)
	public String deleteProductBacklog(@PathVariable long id , Model model){
	
		productBacklogService.deleteProductBacklog(id);
				
		return "redirect:/getProductBacklogs.html";
		
	}
	
	@RequestMapping( value="/editProductBacklog/{id}", method = RequestMethod.GET)
	public String updateProcudtBacklog(@PathVariable long id, HttpSession proSession){
		
		ProductBacklog pro = productBacklogService.getProductBacklogId(id);
		
		proSession.setAttribute("currentProductBacklog", pro);
		
		System.out.println("*************** the product in the session ********"+ pro.getProductName());

		return "redirect:/productBacklogDetail.html";
		
	}
	
	@RequestMapping( value="/productBacklogDetail", method = RequestMethod.GET)
	public String goToProductBacklogDetails(@ModelAttribute("product") ProductBacklog productBacklog,Model model, HttpSession proSession ){
		
		ProductBacklog pro2 = (ProductBacklog) proSession.getAttribute("currentProduct");
		
		model.addAttribute("productBacklog", proSession.getAttribute("currentProduct"));
		
		System.out.println("*************** the product in the model attribute ********"+ pro2.getProductName());
		
		
		//model.addAttribute("categories",productBacklogService.getAllAvailableProductCategory());
		
		return "productBacklogDetails";
		
	}
	
	@RequestMapping(value = "/updateProductBacklog" , method = RequestMethod.POST)
	public String afterEditing(@Valid @ModelAttribute("product") ProductBacklog productBacklog , BindingResult result, HttpSession proSession){
		
		ProductBacklog oldProduct = (ProductBacklog) proSession.getAttribute("currentProduct");

	
		if(result.hasErrors()){
			return "productBacklogDetails";
		}
		else{
			productBacklog.setId(oldProduct.getId());
			productBacklogService.updateProductBacklog(productBacklog);
			
		}
		
		return "redirect:/getProductBacklogs.html";
	}
	
}
