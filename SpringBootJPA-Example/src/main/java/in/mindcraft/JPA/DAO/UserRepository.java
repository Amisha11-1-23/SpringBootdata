package in.mindcraft.JPA.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import in.mindcraft.JPA.Entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	//custome finder method

//	public List<User> findByName(String name);
//	public List<User> findbyNameandCity(String name,String city);
	
	//jpql - for geting all the user
	@Query("select u FROM User u")
	public List<User> getAllUser();

	//find by name
	@Query("select u from User u where u.name=:n")
	public List<User> getUserByName(@Param("n") String name);
	
	//find by name and city
	 @Query("select u from User u where u.name = :name and u.city = :city")
	 public List<User> getUserByNameAndCity(@Param("name") String name, @Param("city") String city);

	 //native query
	 @Query(value = "select * from user",nativeQuery = true)
	 public List<User> getUsers();
	  
}

