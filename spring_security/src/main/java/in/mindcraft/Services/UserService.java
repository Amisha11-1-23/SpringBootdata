package in.mindcraft.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import in.mindcraft.Models.User;


@Service
public class UserService {

	private List<User> store=new ArrayList<>();
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"amisha","amisha@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Rohan","rohan@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Vayu","vayu@gmail.com"));
	}
	
	public List<User> getUser(){
		return this.store;
	}
}
