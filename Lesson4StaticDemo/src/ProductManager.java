
public class ProductManager {

	public void add(Product product) {
		
		//ProductValidator validator = new ProductValidator();
	                                               
		if(ProductValidator.isValid(product)) {    // validator i ProductValidator la degistirdik sonra da ProductValidator i static yaptik.
			System.out.println("Product added.");  //static yaparsak product validator 1 kere olusur ve onu butun kullanicilar o sekilde kullanir. Product Validator daki static{} kismini calistirir.
		}else {                                    
			System.out.println("Failed");
		}
		ProductValidator productValidator = new ProductValidator();
		productValidator.bisey();  // constructor block on'u calistirir. constructorlar newlenince calisir
				
				
	}
	
	
	
	
}


//manager siniflari static yapimaz.
// bir class i static yaptiginizda direkt class ismiyle cagrilir.
