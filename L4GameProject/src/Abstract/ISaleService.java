package Abstract;

import Entites.Campaign;
import Entites.Game;
import Entites.Gamer;

public interface ISaleService {

	void sale(Gamer gamer, Game game , Campaign compaign);
	
	
}
