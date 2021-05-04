package interfaces;

public class CustomerManager {

	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) { //burada private i vermeseydik asagidakiler sadece constructer da tanimlanmis degiskenleri goremez. privatetaki ve contr. daki Logger logger ayni degisken degil.
		this.loggers = loggers;               //
	}



	public void add(Customer customer) {
		System.out.println("Customer added : " +customer.getFirstName());
		
		
		Utils.runLoggers(loggers,customer.getFirstName()); //static yaptigimiz icin classinda newlememize gerek kalmiyo.
		
	
		
		
		// 2 tip baglilik var biri loosly - tightly coupled    
		//this.logger.log(customer.getFirstName());  // gevsek baglama tek tek ekliyoruz burda yorum satiri olmayanlar dizi seklinde coklu
		
		//DatabaseLogger logger = new DatabaseLogger();  // bu kati baglama
		//logger.log(customer.getFirstName()+ "logged on database");
	}
	
	
	
	public void delete(Customer customer) {
		System.out.println("Customer deleted : " +customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLastName());
		
	
	}
	
	
	
	
}
