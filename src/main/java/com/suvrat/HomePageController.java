package com.suvrat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

	@RequestMapping("/")
	public String LoadHomePage(HttpServletRequest request,ModelMap m) {
		HttpSession s = request.getSession();
	    User u=  (User) s.getAttribute("up");
	    
	    if(u != null) {
	    	
	    	return "redirect:/home";
	    }
		return "index";
	}
	
}
