package springmvc.io;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController 
{

//	@ResponseBody
	@RequestMapping("/")
	public String message()
	{
		System.out.println("WelcomeController.message()");
		return "index.jsp";
	}
	@RequestMapping("/admin")
	public String adminDetails()
	{
		System.out.println("WelcomeController.adminDetails()");
		return "admin.jsp";
	}
//=========It is not working properly bcz welcomecontroller_2 is not returning jsp files it can return java objects with @ResponseBody annotation.
	
}
