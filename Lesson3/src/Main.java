
public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "Lenoco V14", 15000, "16 GB RAM",10); // this li productu cagirdigimiz icin diger
																				// constructur calismayacak
		
	
		Product product2 = new Product(); // parametresiz verildiginde product class'inda parametresiz constructer da
											// calisir.
		product2.setId(2);
		product2.setName("Lenovo v16");
		product2.setDetail("16 GB RAM");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Laptop");   
		System.out.println(category1.getId());
		System.out.println(category1.getName());
		
		
		
		
	}

}
