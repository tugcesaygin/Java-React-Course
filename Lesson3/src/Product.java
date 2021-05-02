
public class Product {


	//encapsulation
	private int id; // id ustune sag tik source -> generate fields buradan contructer olusturuyoruz. 
	private String name;
	private double unitPrice; //final bu elemanlara disadan erisim noktasinda kisitliyor. final sadece constructor da set edilebilir demek.
	private String detail;    //private class'a ozeldir.
	private double discount;
	//private double unitPriceafterDiscount;  gerek kalmadi set yapmiyoruz
	
	public Product() {
		
	}
	
	public Product(int id, String name, double unitPrice, String detail,double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount=discount;
		//this.unitPriceAfterDiscount=unitPriceAfterDiscount;  gerek kalmadi set yapmiyoruz
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice*this.discount/100);
	}
	
	
}
