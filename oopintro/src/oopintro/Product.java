package oopintro;

public class Product {
	
	public Product() {
		
		System.out.println("Ben calistim.");
	}
	
	public Product(int id , String name, double unitPrice , String detail ) {
		this.detail = detail; // classtaki this e ait esittirden sonrasi public yani asagiddaki kisim.
		this.id = id;
		this.name=name;
		this.unitPrice =unitPrice;
		//this(); dersen parametresiz olan Producttaki veriyi de yazdirir.
	}
	
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
	
	

}
