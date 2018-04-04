package edu.dmacc.spring.userregistration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	private static final String[] countries = {"France", "United States", "Germany", "England"};
	
	@RequestMapping(value="/form")
		public ModelAndView user() {
			ModelAndView modelAndView = new ModelAndView();
			
			modelAndView.setViewName("userForm");
			modelAndView.addObject("user", new User());
			modelAndView.addObject("countries", countries);
				
				return modelAndView;
	}
}
