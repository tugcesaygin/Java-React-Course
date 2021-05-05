package Concrete;

import Abstract.ICampainService;
import Entites.Campain;

public class CampainManager implements ICampainService {

	@Override
	public void addNewCampain(Campain campain) {
		System.out.println("New Campain added : " + campain.campainName);
		
	}

	@Override
	public void deleteCampain(Campain campain) {
		
		System.out.println("Campain deleted. : " + campain.campainName);
	}

	@Override
	public void updateCampain(Campain campain) {
		
		System.out.println("Campain updated : " + campain.campainName);
	}

	
	
	
}
