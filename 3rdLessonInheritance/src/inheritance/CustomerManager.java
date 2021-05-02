package inheritance;

public class CustomerManager {

	public void add(Customer customer) {  //extend ettigimiz icin customer yazabildik. //bana bi tane musteri ver dedik.
		
		
		System.out.println(customer.customerNumber + "kaydedildi.");
		
		
	}
	
	//bulk insert : method provided by a database management system to load multiple rows of data into a database table.
	
	public void addMultiple(Customer[] customers) {
		
		for(Customer customer : customers) {   //gonderdigin her musteriyi dolasicak ve her musteri icin yukaridaki yeri calistiracak yukaridaki add i calistiricak yukaridaki add de gonderdigin musteri turune gore calisicak.
			
		add(customer );
		}
	
	
	}

}

// SOLID - (O) Open closed principle : sisteme yeni ozellik eklendiginde mevcutta bulunan hicbir kodu degistiremezsin sadece yeni kod ekleyebilirsin.