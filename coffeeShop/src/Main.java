import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Concrete.NeroCustomerManager;
import Adaptors.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entites.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter() );
		
		customerManager.Save(new Customer(1,"Lisa" , "Manoban", LocalDate.of(1997, 5, 5), "1234"));

		System.out.println();
	}

}
