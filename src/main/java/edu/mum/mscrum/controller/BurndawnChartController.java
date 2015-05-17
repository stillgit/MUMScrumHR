package edu.mum.mscrum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class BurndawnChartController {

	
	@RequestMapping(value = "/burndawnChart", method = RequestMethod.GET)
	public String home(){
		
		return "burndawnChart";
		
	}
}
