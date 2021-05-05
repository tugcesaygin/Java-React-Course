package Concrete;

import Abstract.BaseCustomerManager;
import Entites.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	@Override
	public void Save(Customer customer) {
		System.out.println("Save database for Nero : " +customer.getFirstName() + "" +customer.getLastName());
	}
}
