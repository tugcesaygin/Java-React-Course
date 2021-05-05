package Concrete;

import Abstract.ISaleService;
import Entites.Campain;
import Entites.Game;
import Entites.Gamer;

public class SaleManager implements ISaleService{

	@Override
	public void sale(Gamer gamer, Game game, Campain campain) {
		double discountedPrice = game.getPrice() - (game.getPrice()* campain.getDiscountRate()/100);
		
		System.out.println(gamer.getFirstName() +" " + gamer.getLastName()
		+"bought " + game.getGameName() + "for £" + discountedPrice + "with a discount called" +campain.getCampainName() );
		
	}

}
