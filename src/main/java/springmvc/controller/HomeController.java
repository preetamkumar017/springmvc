package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("name","Preetam");
		model.addAttribute("id",123);
		
		List<String> friends = new ArrayList<String>() ;
		friends.add("1");
		friends.add("sjfb1");
		friends.add("eg");
		friends.add("sfe");
		friends.add("hello");

		model.addAttribute("list",friends);
		
		return "index";
	}
	@RequestMapping("/about")
	public String about()
	{
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("this is help");
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("name","Preetam");
		modelAndView.addObject("id",123);
		
		List<String> friends = new ArrayList<String>() ;
		friends.add("1");
		friends.add("sjfb1");
		friends.add("eg");
		friends.add("sfe");
		friends.add("hello");

		modelAndView.addObject("list",friends);
		
		modelAndView.setViewName("help");
		
		return modelAndView;
	}

}
