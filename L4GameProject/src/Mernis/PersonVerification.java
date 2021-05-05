package Mernis;

import java.time.LocalDate;

public class PersonVerification {
	
	public boolean verificatePerson(String nationalityid ,String firstName ,String lastName , int dateOfBirth) {
		System.out.println(firstName + "" + lastName  + "has been verified");
		return true;
	}

}
