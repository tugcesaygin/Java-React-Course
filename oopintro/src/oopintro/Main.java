package oopintro;

public class Main {

	public static void main(String[] args) { // referans olusturma 
		
		
		
		Product product1 = new Product(1 , "Lenoco V14", 15000, "16 GB RAM"); //this li productu cagirdigimiz icin diger constructur calismayacak
		
	
		

		Product product2 = new Product();
		product2.id = 2;
		product2.name = "Lenovo V1";
		product2.unitPrice = 10000;
		product2.detail = "8 GB RAM";
		
		

		Product product3 = new Product();
		product3.id = 3;
		product3.name = "HP";
		product3.unitPrice = 15000;
		product3.detail = "16 GB RAM";
		
		
		Product[] products = {product1,product2,product3};
		
		
		
		
		
		for(Product product : products) { //Product verinin turu , product degisken , product i producti productda donduruyo 
			
			System.out.println(product.name);
		}
		
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		Category category2= new Category();
		category2.id = 2;
		category2.name = "Ev/Bahce";
		
		
		ProductManager productManager = new ProductManager(); // class in kaynagini kullanmadan once onlari newle
		productManager.addToCart(product1); // parametre : metot data ya ihtiyac duyuyorsa parantes icine deger verilebilir
		productManager.addToCart(product2); //product'in bellek adresi yollaniyor
		

	}

	
	
}
