
public class CustomerManager {

	private ICustomerDal customerDal;  // disardan erisimi kapattim bir alt satirdaki kodu kullanmak istiyorsam. en alttakini kullanmak istiyorsam private yapmama gerek yok.
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;   // bu kod CustomerManager'in constructor'inda ben bir tane ICustomerDal istiyorum (oracle,mysql)
	}
	
	
	
	
	public void add() {
		//is kodlari yazilir
		
		customerDal.add();
	}
}
