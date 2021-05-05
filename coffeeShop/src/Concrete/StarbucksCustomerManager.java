package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entites.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private ICustomerCheckService customerCheckService ;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService){
		
		this.customerCheckService = customerCheckService;
	}
	
	
	
	@Override
	public void Save(Customer customer) {
		
		if(this.customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}else {
			System.out.println("Not a valid person");
		
		
	}

	
}
}
