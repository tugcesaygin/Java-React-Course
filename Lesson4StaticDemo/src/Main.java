
public class Main {

	public static void main(String[] args) {
		
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price = 555;
		product.id = 5;
		product.name= "Mouse";
		
		manager.add(product);

		DatabaseHelper.Crud.delete();
	}

}


// static nedir ? ornegin biz bu maini baska bir yerden cagirmaya calisisak , 
//hicbir sekilde newleyerek buna ulasamayiz. onun yerine Main.main diyerek ulasabiliriz. 