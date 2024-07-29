package springmvc.io;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController 
{
	@RequestMapping("/")
	public String welcome()
	{
		System.out.println("WelcomeController.welcome()");
		return "home";
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public String login()
	{
		System.out.println("WelcomeController.login()");
		return "Login Successfully Done!!!!!";
	}
	
	
	
	// This Program is running but the error is continuously showing at 1st line in home.jsp
	

}
