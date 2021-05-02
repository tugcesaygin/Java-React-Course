package inheritance;

public class Main {

	public static void main(String[] args) {
		
		
		IndividualCustomer tugce = new IndividualCustomer();
		tugce.customerNumber = "123456 ";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();    //polymorphism sayesinde calisiyor (CustomerManger add fonk Customer customer yaptik) // extends yapmamiz sayesinde onu extend
		hepsiBurada.customerNumber = "789456 ";                      // eden siniflarin referanslarini tutabilir.
		
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber="3333333 ";
		
		
		
		CustomerManager customerManager = new CustomerManager();
		
		
		
		Customer[] customers = {tugce , abc , hepsiBurada};    // polymorphismle beraber arrayleri kullanarak toplu ekleme islemi yapiliyor boylece
		customerManager.addMultiple(customers);                //her musteri icin farkli kisimleri calistirmis oldum.
		
		
		
		// ayri ayri cagirmak yerine yukaridaki islem uygulanir: 
		//customerManager.add(hepsiBurada);
		//customerManager.add(tugce);
		//customerManager.add(abc);  // sistemde degisiklik yapmadan polymorphism sayesinde sadece kod ekleyerek hallettik.
	}

}
