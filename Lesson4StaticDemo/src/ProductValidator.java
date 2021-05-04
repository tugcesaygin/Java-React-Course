
public class ProductValidator {// ana class static olamaz. inner classlar olabilir.

	static {
		System.out.println("static on");
	}
	
	
	public ProductValidator() {
		
		System.out.println("Constructor block on");
	}
	
	
	public static boolean isValid(Product product) {
	
		if(product.price>0 && !product.name.isEmpty()) {  // bos degilse !
			return true;
			
		} else {
			return false;
		}
	}
	
	public void bisey() {
		
	}
	
	
	public static class BaskaClass{
		
		public static void delete() {         //inner class
		
		
	}
}
}
