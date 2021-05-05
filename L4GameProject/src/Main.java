import java.time.LocalDate;

import Adaptors.SimulatedMerisService;
import Concrete.CampainManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entites.Campain;
import Entites.Game;
import Entites.Gamer;

public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager = new GamerManager(new SimulatedMerisService());
		Gamer gamer = new Gamer ("S ","T ",LocalDate.of(1990,5, 26),"1111");
		gamerManager.add(gamer);
		
		
		GameManager gameManager = new GameManager();
		Game game = new Game("Friday Night" ,35,"Horror",2);
		gameManager.addGame(game);
		
		CampainManager campainManager = new CampainManager();
		Campain campain = new Campain("On Crazy Monday Discount!!",LocalDate.of(2021, 4, 12),LocalDate.of(2021, 5,10), 50);
		campainManager.addNewCampain(campain);
		
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(gamer, game, campain);
		
		
		
		
		
		
	}

}
