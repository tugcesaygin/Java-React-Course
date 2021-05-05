package Concrete;

import Abstract.ISaleService;
import Entites.Campaign;
import Entites.Game;
import Entites.Gamer;

public class SaleManager implements ISaleService{

	@Override
	public void sale(Gamer gamer, Game game, Campaign campaign) {
		double discountedPrice = game.getPrice() - (game.getPrice()* campaign.getDiscountRate()/100);
		
		System.out.println(gamer.getFirstName() +" " + gamer.getLastName()
		+"bought " + game.getGameName() + "for £" + discountedPrice + "with a discount called" +campaign.getCampaignName() );
		
	}

}
