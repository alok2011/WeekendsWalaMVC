package springmvc.io;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController 
{
	@RequestMapping("/")
//	@ResponseBody
	public String message()
	{
		System.out.println("WelcomeController.message()");
		return "home";
	}
	@RequestMapping("/admin")
	public String adminDetails()
	{
		System.out.println("WelcomeController.adminDetails()");
		return "admin";
	}
}
