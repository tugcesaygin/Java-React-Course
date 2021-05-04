
public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		
	    customerManager.databaseManager = new OracleDatabaseManager(); // burada kimin calisacagini soyledik
		customerManager.getCustomers();
		

	}

}
