package eTicaret;

import java.util.Scanner;

import business.abstracts.AuthService;
import business.abstracts.UserService;
import business.concrete.AuthManager;
import business.concrete.UserManager;
import core.concretes.VerificationManager;
import core.concretes.googleManagerAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;
import dataAccess.abstracts.UserDao;

public class Main {

	static Scanner in = new Scanner(System.in);
	static AuthService authService = new AuthManager(new UserManager(new HibernateUserDao()),
			new googleManagerAdapter(), new VerificationManager());

	public static void main(String[] args) {

		User user = new User();
		

		System.out.println(" ----W E L C O M E----");
		System.out.println("Select the action you want. : "
				+ "1. Register"
				+ "2. Register with Google"
				+ "3. Login"
				+ "4. Exit");
		
		int key = in.nextInt();
		switch (key) {
		case 1:

			System.out.println("First Name: ");
			String firstName = in.next();

			System.out.println("Surname: ");
			String lastName = in.next();

			System.out.println("Email Address: ");
			String email = in.next();

			System.out.println("Password: ");
			String password = in.next();

			authService.register(user.getFirstName(), user.getLastName(), user.geteMail(), user.getPassword(),
			user.getId());
			break;

		case 2:
			System.out.println("GMail: ");
			String eMail2 = in.next().toString();

			System.out.println("Password: ");
			String password2 = in.next().toString();

			authService.registerWithGoogle(eMail2, password2);
			break;

		case 3:
			System.out.println("Email Address: ");
			String eMail1 = in.next();

			System.out.println("Password: ");
			String password1 = in.next();

			authService.login(eMail1, password1);
			break;

		case 4:
			System.out.println("Quit");
			break;
		default:
			System.out.println("Wrong number! Please enter a number only between 1-4 !");
			break;
		}
	}

}
