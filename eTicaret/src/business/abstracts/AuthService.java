package business.abstracts;

public interface AuthService {

	void register(String firstName , String lastName, String eMail , String password, int id);
	void registerWithGoogle(String eMail,String password);
	void login(String eMail , String password);
	void logout();
	
}
