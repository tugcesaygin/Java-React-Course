package Abstract;

import Entites.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	
	@Override
	public void Save(Customer customer) {
		
		System.out.println("Saved to Database : " +customer.FirstName);
		
	}

}
