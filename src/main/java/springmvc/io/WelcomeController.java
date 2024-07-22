package springmvc.io;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class WelcomeController 
{
	
	@RequestMapping("/login")
	public String display(@RequestParam(name = "name") String name, @RequestParam(name = "pass") String pass, Model m)
	{
		System.out.println("WelcomeController.display()");
		
		if(name.equals("kunal") && pass.equals("admin"))
		{
			String msg = "Hello "+name+" All Is Yours";
			m.addAttribute("message",msg);
			return "viewPage.jsp";
		}
		else
		{
			System.out.println("WelcomeController.display2()");
			String msg = "Sorry " + name + ". You entered an incorrect name or password";
			m.addAttribute("message", msg);
			return "errorPage.jsp";
		}
		
		
	}
	
	
	
	
	@RequestMapping("/")
	public String welcome()
	{
		System.out.println("WelcomeController.welcome()");
		return "indexx.jsp";
	}
	
	
//========Ye Hum Servlet Me Karte The Ab hum iski jagah @RequestParam Annotation kam Kregaa=================================	
	
//	@RequestMapping("/login")
//	public String display(HttpServletRequest req, Model m) {
//		
//		String name = req.getParameter("name");
//		String pass = req.getParameter("pass");
//		
//		System.out.println("HelloWorldController.display()");	
//		if (name.equals("kunal") && pass.equals("admin")) {
//			String msg = "HELLO " + name + " Now ALL YOURS IN MVC";
//			// add a message to the model
//			m.addAttribute("message", msg);
//			return "viewPage.jsp";
//		} else {
//			String msg = "Sorry " + name + ". You entered an incorrect name or password";
//			m.addAttribute("message", msg);
//			return "errorPage.jsp";
//		}
//	}
	
}
