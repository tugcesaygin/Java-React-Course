package business.concrete;
import business.concrete.UserManager;
import business.abstracts.AuthService;
import business.abstracts.UserService;
import core.abstracts.GoogleRegisterService;
import core.abstracts.VerificationService;
import entities.concretes.User;

public class AuthManager implements AuthService{

	

	private GoogleRegisterService gRegisterService;
	private UserService uService;
	private VerificationService vService;
	
	public AuthManager(UserService uService, GoogleRegisterService gRegisterService, VerificationService vService) {
		super();
		this.gRegisterService = gRegisterService;
		this.uService = uService;
		this.vService = vService;
	}
	
	@Override
	public void register(String firstName, String lastName, String eMail, String password, int id) {
		if(this.uService.add(new User(firstName,lastName,eMail,password,id))) {
			System.out.println("Register successful!  Verify now.");
			this.vService.send();
		}else {
			System.out.println("Register failed , please try again.");
		}
		
	}

	@Override
	public void registerWithGoogle(String eMail, String password) {
		if(this.gRegisterService.register(eMail, password) != null) {
			this.uService.add(this.gRegisterService.register(eMail, password));
			System.out.println("Successfully registered with Google.");
		}else {
			System.out.println("Could not connect with Google account");
		}
		
	}

	@Override
	public void login(String eMail, String password) {
		if(this.uService.getByEMail(eMail)!= null ) {
			if(this.uService.getByEMail(eMail).equals(eMail)&&this.uService.getByEMail(password).equals(password));
			System.out.println("Login Succesful");
		
		}else {
			System.out.println("You e-mail address or password is incorrect.");
		}
	}

	@Override
	public void logout() {
		System.out.println("You logged out of the system.");
		
	}
	
	

}
