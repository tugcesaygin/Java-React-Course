package Concrete;

import Abstract.IGameService;
import Entites.Game;

public class GameManager implements IGameService {

	@Override
	public void addGame(Game game) {
		System.out.println("Game added. " +game.gameName);
		
	}

	@Override
	public void deleteGame(Game game) {
		
		System.out.println("Game deleted. " +game.gameName);
	}

	@Override
	public void updateGame(Game game) {
		System.out.println("Game updated. " +game.gameName);
		
	}

}
