package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {

	boolean add(User user);
	
	void update(User user);

	
	void delete(User user);
	
	List<User> getAll();
	
	User getById(int id);
	User getByEMail(String eMail);
	
	
		
	}

