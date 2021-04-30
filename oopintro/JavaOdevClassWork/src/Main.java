
public class Main {

	public static void main(String[] args) {
		
		//classlar referans tiptir.
		CustomerManager customerManager = new CustomerManager(); //customerManager yerine abc de yazilabilirdi o sadece ornegin adi.
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2; // 2'ye esitlendi demek ilki iptal oldu demek
		customerManager.Add();
		customerManager.Remove();
		
		//deger tip - value tip
		int sayi1 = 10;
		int sayi2 = 20 ;
		sayi2 = sayi1;
		sayi1 = 30 ; 
		System.out.println(sayi2); // ilk sayi1 i yazdirir yani esitlemedenm onceki degeri alir.

		//referans tip  --> kod sirasindan onemi yok heapte degistiyse o yazilir
		int [] sayilar1 = new int [] {1,2,3};
		int [] sayilar2 = new int [] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
		

	
	
}

}
