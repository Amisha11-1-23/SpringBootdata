package in.mindcraft.Controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.mindcraft.Models.User;
import in.mindcraft.Services.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<User> getUser() {
		
		System.out.println("Getting user");
		return this.userService.getUser();
	}
	
	@GetMapping("/current-user")
	public String getLoggedUser(Principal principal) {
		
		return principal.getName();
	}
}
