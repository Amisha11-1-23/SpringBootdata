package in.mindcraft.Models;
public class User {
	private String userID;
	private String name;
	private String email;
	public User() {
		super();
	}
	public User(String userID, String name, String email) {
		super();
		this.userID = userID;
		this.name = name;
		this.email = email;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [userID=" + userID + ", name=" + name + ", email=" + email + "]";
	}
}
