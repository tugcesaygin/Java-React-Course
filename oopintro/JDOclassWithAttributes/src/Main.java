
public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(88,"ASUS","16GB RAM",5560,3,"Red");
		
	     //** iki sekilde de yazilablir
		//product.set_description("16 GB RAM");
		//product.setId(888);
		//product.set_name("Laptop");
		//product.set_stockAmount(3);
		//product.setColor("Red");
		
		
		
		
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		System.out.println(product.getCode());

	}

}
