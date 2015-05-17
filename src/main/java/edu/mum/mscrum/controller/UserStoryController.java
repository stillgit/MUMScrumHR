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

import edu.mum.mscrum.model.ProductBacklog;
import edu.mum.mscrum.model.UserStory;
import edu.mum.mscrum.service.IUserStoryService;
import edu.mum.mscrum.service.IProductBacklogService;


@Controller
public class UserStoryController {
	
	@Autowired
	private IUserStoryService userStoryService;
	
	@Autowired
	private IProductBacklogService productBacklogService;
	
	
	@RequestMapping( value="/addUserStory/{id}", method = RequestMethod.GET)
	public String addUserStory(@PathVariable long id,@ModelAttribute("userStory") UserStory userStory,Model model, HttpSession proSession){
		
		ProductBacklog pro = productBacklogService.getProductBacklogId(id);
		proSession.setAttribute("currentProductBacklog", pro);
		
		model.addAttribute("productBacklog", proSession.getAttribute("currentProductBacklog"));
		System.out.print("!!!!!!!!!!!!!!!!!"+pro.getCategory()+"!!!!!!!!!!!!!!!!!!!!!! the current product backlog");
		
			return "addUserstory";
		
	}

	@RequestMapping(value = "/addUserStory", method = RequestMethod.POST)
	public String saveUserStory(@Valid @ModelAttribute("userStory") UserStory userStory, BindingResult result,Model model,HttpSession proSession) {
		
		System.out.println("result has errors: " + result.hasErrors());
		
		if(result.hasErrors()) {
			return "addUserstory";
		}
		else{
			ProductBacklog currentPro=(ProductBacklog) proSession.getAttribute("currentProductBacklog");
			System.out.println("!!!!!!!!!!!"+currentPro.getCategory()+"!!!!!!!!!!!!"+"while setting the userstory");
			userStory.setProductBacklog(currentPro);
			//currentPro.getUserStories().add(userStory);
			//currentPro.setUserStories(userStories);
			userStoryService.save(userStory);
			//productBacklogService.updateProductBacklog(currentPro);
			
			
		}
		
		return "redirect:/getUserStories.html";
	}
	
	
	
//		@RequestMapping( value="/addProductBacklog2", method = RequestMethod.GET)
//		public String addProcudtBacklog2(@ModelAttribute("productBacklog") UserStory userStory){
//			
//				return "addProductBacklog";
//			}
//		
		
		@RequestMapping(value = "/getUserStories", method = RequestMethod.GET)
		public String allUserStoryByProductBacklog(Model model, HttpSession proSession) {
			
			ProductBacklog currentProductBacklog= (ProductBacklog) proSession.getAttribute("currentProductBacklog");
	        List<UserStory> userStories = userStoryService.allUserStoryByProductBacklog(currentProductBacklog.getId());
				        
			model.addAttribute("userStories", userStories);
			
			return "getUserStories";
		}
		
		@RequestMapping( value="/deleteUserStory/{id}", method = RequestMethod.GET)
		public String deleteUserStories(@PathVariable long id , Model model){
		
			userStoryService.deleteUserStory(id);
								
			return "redirect:/getProducts.html";
			
		}

}
