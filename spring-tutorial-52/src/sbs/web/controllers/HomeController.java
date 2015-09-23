package sbs.web.controllers;



import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sbs.web.dao.User;
import sbs.web.service.UserService;




@Controller
public class HomeController {
private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
//	@RequestMapping("/")
//	public ModelAndView showhome(HttpSession session){
//		 ModelAndView mv = new ModelAndView("home");
//		 Map<String, Object> model = mv.getModel();
//		 model.put("name", "River");
//		return mv;
//	}
	@RequestMapping("/")
	public String showhome(Model model){
		
		//List<User> users = userService.getCurrent();
//		User user = new User(29,"dsndjs", "smadhaxncxcnv2@gmail.com","c");
//		userService.testSave(user);
//		
	//	model.addAttribute("offers", users);
		return "home";
	}
	
	@RequestMapping("/one")
	public String one(Model model){
		
		
		return "one";
	}
	@RequestMapping("/two")
	public String two(Model model){
		
		
		return "two";
	}
	@RequestMapping("/three")
	public String three(Model model){
		
		
		return "three";
	}
	
	
}
