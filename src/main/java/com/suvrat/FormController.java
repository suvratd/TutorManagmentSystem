package com.suvrat;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

	@RequestMapping("/registrationform")
	public String LoadHomePage(Model theModel) {
		theModel.addAttribute("user", new User());
		return "registrationform";
	}
	
	@RequestMapping("/ProcessUserRegistration")
	public String ProcessUserRegistration(
			@Valid @ModelAttribute("user") User theUser, BindingResult theBindingResult) {
		if(theBindingResult.hasErrors()) {
			return "registrationform";
		}else {
			SessionFactory factory = new Configuration().configure("/resources/hibernate.cfg.xml").addAnnotatedClass(User.class)
					.buildSessionFactory();

			Session session = factory.getCurrentSession();

			try {
				System.out.println("Transaction");
				session.beginTransaction();
				session.save(theUser);
				session.getTransaction().commit();
				System.out.println("Done!");
			} finally {
				factory.close();
			}
			return "user-confirm";
		}
		
	}
}
