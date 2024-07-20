package springmvc.io;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ele")
public class WelcomeController_2 
{
	@RequestMapping(path = {"/getmapping", "/fetchMapping"})
//	@ResponseBody
	public String disp()
	{
		System.out.println("Controller- fetchMapping");
		return "alok.jsp";
	}

	

}
