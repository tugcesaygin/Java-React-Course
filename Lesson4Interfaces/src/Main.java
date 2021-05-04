
public class Main {

	public static void main(String[] args) {
		
		//ICustomerDal customerDal = new OracleCustomerDal();
		//customerDal.add();
		
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		//customerManager.customerDal = new OracleCustomerDal();  private yaptik CustomerManagerdakini buna gerek kalmadi.
		customerManager.add();
				

	}

}
