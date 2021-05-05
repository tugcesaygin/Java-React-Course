package nLayeredDemo.business.concrete;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
//import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class ProductManager implements ProductService{
	
	private ProductDao productDao ;  
	private LoggerService loggerService;
	
	
	public ProductManager(ProductDao productDao , LoggerService loggerService){
		
		super();
		this.loggerService = loggerService;
		this.productDao = productDao;
	}
	
	
	
	public ProductManager(ProductDao productDao) {  //hibernate in referanslarini tutar 
		super();
		this.productDao = productDao;
	}

	
	@Override
	public void add(Product product) {
	
		//is kodlari yazilir 
		if(product.getCategoryId()==1) {
			System.out.println("bu kategoride urun kabul edilmiyor");
			return;
		}
		
		//HibernateProductDao dao = new HibernateProductDao();      kotu yazimdir bu. yukaridakini gevsek bagliligi tercih ederiz
		//dao.add(product);
		
		this.productDao.add(product);   //hibernate'e bagimli degilim.
		this.loggerService.logToSystem("product added :  " +product.getName());
		
		
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}


//dis dunyanin interface ini enjekte etme.
