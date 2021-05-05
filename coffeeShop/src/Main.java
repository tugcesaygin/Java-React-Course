import java.time.LocalDate;




import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Concrete.NeroCustomerManager;
import Adaptors.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entites.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager.Save(new Customer(1,"Tuğçe" , "Saygın", LocalDate.of(2000, 2, 5), "1223"));

		
		
	}

}
