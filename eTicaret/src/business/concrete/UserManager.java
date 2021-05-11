package business.concrete;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	
	public UserManager (UserDao userDao) {
		this.userDao = userDao;
	}

	
	
	@Override
	public boolean add(User user) {
		
		boolean result = false;
		
		if(CheckIfEmailIsNeverUsed(user.geteMail())&&checkIfEmailIsValid(user.geteMail())){
			if(checkIsPasswordIsOk(user.getPassword())) {
				if(CheckIfNameLengthValid(user.getFirstName(), user.getLastName())) {
					this.userDao.add(user);			
					System.out.println("Your registration is successful"); 
					result = true;
					 return result ;
					
					
				}else {
					System.out.println("Your first or last name is less than two characters.");
				}
				
			}else {
				System.out.println("Password should be longer than six characters.");
			}
			
		}else{
			System.out.println("This email is alredy used.");
		}
		
		return result;
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
		
	}

	

	@Override
	public void delete(User user) {
		
		System.out.println("User deleted." );
		
	}

	@Override
	public List<User> getAll() {
		
		return this.userDao.getAll();
	}

	@Override
	public User getById(int id) {

		return this.userDao.get(id);
	}
	
	
	
	public boolean checkIfEmailIsValid (String eMail) {
		
			boolean result = false;
			Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
			Matcher matcher = pattern.matcher(eMail);
			if(matcher.matches()) {
				result = true;
			}
			return result;
		}
	
	
	
	public boolean CheckIfEmailIsNeverUsed(String eMail) {
		boolean result = false;
		if(this.userDao.get(eMail) == null) {
			result = true;
		}
		return result;
	}
	
	

	@Override
	public User getByEMail(String eMail) {
		
		return this.userDao.get(eMail);
	}

	
	public boolean checkIsPasswordIsOk(String password) {
		
		if(password.length()>=6) {
			return true;
		}
		return false;
	}

	public boolean CheckIfNameLengthValid(String firstName, String lastName) {
		boolean result = false;
		if(firstName.length() >=2 && lastName.length() >= 2){
			result = true;
		}
		return result;
	}



	public void login(String geteMail, String password) {
		// TODO Auto-generated method stub
		
	}



	public void register(User user3) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}