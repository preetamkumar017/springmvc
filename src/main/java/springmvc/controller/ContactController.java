package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model model) {

		model.addAttribute("header","this is header234566");
		model.addAttribute("desc","this is description");
	}

	@RequestMapping("/contact")
	public String showForm(Model model) {
		return "contact";
	}



	@RequestMapping(path = "proccessForm",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		model.addAttribute("user",user);
		
		this.userService.createUser(user);
		return "success";
	}
	
	

//	@RequestMapping(path = "proccessForm",method = RequestMethod.POST)
//	public String handleForm(@RequestParam("email") String email,@RequestParam("name") String name,@RequestParam("password") String password,Model model) {
//		System.out.println(email);
//		System.out.println(name);
//		System.out.println(password);
//		
//		User user = new User(name,email,password);
//
//		model.addAttribute("user",user);
//		return "success";
//	}
}
