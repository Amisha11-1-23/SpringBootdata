package in.mindcraft.JPA;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import in.mindcraft.JPA.DAO.UserRepository;
import in.mindcraft.JPA.Entities.User;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "in.mindcraft.JPA.DAO")
public class BootJpaExampleApplication {

	public static void main(String[] args) {
		
		ApplicationContext context=SpringApplication.run(BootJpaExampleApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
//		User user=new User();
//		user.setName("Amisha");
//		user.setCity("mumbai");
//		user.setStatus("working");
//		
//		User user1=userRepository.save(user);
//		System.out.println(user1);

//		create user object
//		User user1=new User();
//		user1.setName("vayu");
//		user1.setCity("surat");
//		user1.setStatus("Kid");
//		
//		User user2=new User();
//		user2.setName("Rohan");
//		user2.setCity("mumbai");
//		user2.setStatus("devloper");
//		
//		//saving single user
//		//User resutUser=userRepository.save(user2);
//		
//		//all user save
//		List<User> users=List.of(user1,user2);
//		Iterable<User> resultIterable=  userRepository.saveAll(users);
//		
//		resultIterable.forEach(user->{
//			System.out.println(user);
//		});
////		
		//Update particular employee
		
//		Optional<User> optional=userRepository.findById(152);
//		User user=optional.get();
//		user.setCity("mumbai");
//		User updateResult=userRepository.save(user);
//		System.out.println(updateResult);
		
		//get all data from database
//		Iterable<User> itr=userRepository.findAll();
//		Iterator<User> iterator=itr.iterator();
//		while(iterator.hasNext()) {
//			User user=iterator.next();
//			System.out.println(user);
//		}
//		
//		itr.forEach(user->{System.out.println(user);});
		
		//delete user data from table
		
		//userRepository.deleteById(152);
		//delete all
		
//		Iterable<User> allusers=userRepository.findAll();
//		allusers.forEach(user->System.out.println(user));
//		userRepository.deleteAll(allusers);
		
//		
		List<User> allUser=userRepository.getAllUser();
		
		allUser.forEach(e->{
			System.out.println(e);
		});
		
		List<User> userByName=userRepository.getUserByName("Rohan");
		
		userByName.forEach(e->{
			System.out.println(e);
		});
		
		List<User> usersByNameAndCity = userRepository.getUserByNameAndCity("Rohan", "mumbai");
        usersByNameAndCity.forEach(user -> System.out.println(user.getName() + " from " + user.getCity()));

        userRepository.getUsers().forEach(e->{System.out.println(e);});
		
	}

}
