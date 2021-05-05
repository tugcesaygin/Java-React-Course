package Adaptors;

import Abstract.CheckUserService;
import Entites.Gamer;
import Mernis.PersonVerification;

public class SimulatedMerisService implements CheckUserService {

	
	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		
		PersonVerification person = new PersonVerification();
		
		boolean result = true ;

		try {
			result = person.verificatePerson(gamer.getNationalityId() , gamer.getFirstName() , gamer.getLastName() , gamer.getDateOfBirth().getYear());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
