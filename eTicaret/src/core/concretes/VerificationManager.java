package core.concretes;

import core.abstracts.VerificationService;

public class VerificationManager implements VerificationService{

	@Override
	public void send() {
		System.out.println("Please click the verification link.");
		
	}

}
