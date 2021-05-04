
public abstract class GameCalculator {  //base
	
	
	public abstract void hesapla();   // hesaplayi kim implemente ediyosa (inherit) hesaplayi icermek zorunda!! override yani 

	public final void gameOver() {  // final dedikten sonra override edilemez. game calculator i kim kullaniyorsa gameOver i oldugu gibi kullanmak zorunda
		
		System.out.println("!!!Oyun Bitti!!!");
	}
	
	
}
