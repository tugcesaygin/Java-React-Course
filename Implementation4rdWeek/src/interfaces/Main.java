package interfaces;

public class Main {

	public static void main(String[] args) {
		
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger() };
		
		CustomerManager customerManager = new CustomerManager(loggers);  // kullanacagimi newlemem gerek  // senin bagimliligin smstir dend
		
		Customer tugce = new Customer(1,"Tugce ","Saygin");
		
		customerManager.add(tugce);
		
	
	}

}
