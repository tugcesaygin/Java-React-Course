package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concrete.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdaptor;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		
		//ToDo : Spring IoC ile cozulecek
		ProductService productService = new ProductManager(new AbcProductDao(), 
				new JLoggerManagerAdaptor());
		
		
		Product product = new Product(2,2,"elma",15,50);
		productService.add(product);

	}

}
//test ortami 
//InterFace somut siniflarin ref tutabilir ,sag taraf manager ondan bu interface tutabilir