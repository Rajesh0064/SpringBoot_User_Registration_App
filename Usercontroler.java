package com.rajesh;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Usercontroler {

	@RequestMapping("/")
    public String userform(ModelMap model)
    {
		Users users = new Users();
		model.put("users",users);
		return "register";
  	  
    }
    @RequestMapping("/register")
    public String formdetails(@ModelAttribute Users users,ModelMap model) {
  	
  	  model.put("users", users);
  	 return "result";
		
		
	}
}
