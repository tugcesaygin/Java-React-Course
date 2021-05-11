package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import business.concrete.UserManager;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;
import business.abstracts.AuthService;

public class HibernateUserDao implements UserDao{

	private List<User> userList;
	
	public HibernateUserDao() {
		userList = new ArrayList<User>();
	}
	
	
	@Override
	public void add(User user) {
		user.setId(user.getId() + 1);
		userList.add(user);
		System.out.println("User added " +user.getFirstName() + "" + user.getLastName());
	}

	@Override
	public void delete(User user) {

		user.setId(user.getId() - 1);
		userList.remove(user);
		System.out.println("User added " +user.getFirstName() + "" + user.getLastName());
		
	}

	@Override
	public void update(User user) {
		
		System.out.println("User updated" +user.getFirstName() + "" + user.getLastName());
	}

	@Override
	public User get(int id) {
		
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return userList;
	}


	@Override
	public User get(String eMail) {
		
		return null;
	}

}
