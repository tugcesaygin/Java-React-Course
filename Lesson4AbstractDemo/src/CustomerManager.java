
public class CustomerManager {
	
	BaseDatabaseanager databaseManager;
	
	public void getCustomers() {

		databaseManager.getData();    //bu kodlar sayesinde tek bir secenege bagli kalmiyoruz.
		
	}
}
