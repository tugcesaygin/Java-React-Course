package core.concretes;

import core.abstracts.GoogleRegisterService;
import entities.concretes.User;
import google.googleManager;
import google.googleUser;
import business.abstracts.AuthService;

public class  googleManagerAdapter implements GoogleRegisterService{

	
	@Override
	public User register(String eMail, String password) {
		
		googleManager manager = new googleManager();
		googleUser usergoogle = manager.register(eMail, password);
		User user = new User(usergoogle.getFirstName(), 
				usergoogle.getLastName() , usergoogle.getPassword(),
				usergoogle.getEMail(), usergoogle.getId());
		return user;

			
	}
	

}
