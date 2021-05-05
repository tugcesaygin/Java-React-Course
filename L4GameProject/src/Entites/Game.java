package Entites;

public class Game {

	public String gameName;
	public double price;
	public String gametType;
	public int id;
	
	
	
	public Game(String gameName, double price, String gametType, int id) {
		super();
		this.gameName = gameName;
		this.price = price;
		this.gametType = gametType;
		this.id = id;
	}


	
	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getGametType() {
		return gametType;
	}


	public void setGametType(String gametType) {
		this.gametType = gametType;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
