
public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName() +"" + user.getLastName() + "" + " User added!");
	}
	
	

	public void delete(User user) {
		System.out.println(user.getFirstName() +"" + user.getLastName() + "" + " User deleted!");
	}
	
	
	public void update(User user) {
		System.out.println(user.getFirstName() +"" + user.getLastName() + "" + " User Updated!");
	}
	
	public void addMultiple(User[] users) {
		
		for(User user : users) {
			
			add(user);
			
		}
	}
	
}
