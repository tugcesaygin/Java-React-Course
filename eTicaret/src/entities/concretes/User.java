package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity{
	
	private String firstName;
	private String lastName;
	private String password;
	private String eMail;
	private int id;
	
	
	public User() {
		
	}
	
	
	public User(String firstName, String lastName, String password, String eMail , int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.eMail = eMail;
		this.id= id;
	}
	
	
	public String getFirstName() {
	return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	


	
	
	
	
	

}
