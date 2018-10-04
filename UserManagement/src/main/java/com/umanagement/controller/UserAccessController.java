package com.umanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.umanagement.entity.UserRegistration;





@Controller
public class UserAccessController {
	

	@Autowired
	private UserAccessService userAccessService;
	
	/*@RequestMapping(value="/")
    public String showForm(){
        return "index";
    }*/
	@RequestMapping("/start")
    public String inside(ModelMap model,@ModelAttribute("user")UserRegistration user){
		System.out.println("inside controller....................");
        return "registration";
    }
	@RequestMapping(value= "/formSubmit",method=RequestMethod.POST)
    public String submitForm(ModelMap model,@ModelAttribute("user")UserRegistration user){
		userAccessService.registerUser(user);
        return "registration";
    }

}
