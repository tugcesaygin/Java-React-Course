package Concrete;

import Abstract.IGamerService;
import Abstract.CheckUserService;
import Entites.Gamer;

public class GamerManager implements IGamerService{

	private CheckUserService checkUserService;
	
	public GamerManager(CheckUserService checkUserService) {
		this.checkUserService = checkUserService;
	}
	
	public void add(Gamer gamer) {
		if(checkUserService.CheckIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " added");
		}else {
			System.out.println("Failed.");
		}
	}
	
	
	
	@Override
	public void addGamer(Gamer gamer) {
		System.out.println("Gamer Added : " + gamer.firstName + "" + gamer.getLastName() + "username : " + gamer.userName);
		
	}

	@Override
	public void deleteGamer(Gamer gamer) {
		System.out.println("Gamer Deleted : " + gamer.firstName + "" + gamer.getLastName() + "username : " + gamer.userName);
		
	}

	@Override
	public void updateGamer(Gamer gamer) {
		System.out.println("Gamer Updated : " + gamer.firstName + "" + gamer.getLastName() + "username : " + gamer.userName);
		
	}

	
}
