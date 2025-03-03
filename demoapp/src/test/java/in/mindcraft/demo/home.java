package in.mindcraft.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class home {

	@RequestMapping("home")
	public void fun()
	{
		System.out.println("Function called");
	}
}
