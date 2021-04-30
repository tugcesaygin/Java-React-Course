
public class Product {   //private sadece tanimlandigi suslu parantezle icinde gecerli
	
	
	public Product(int _id,String _name,String _description,double _price ,int _stockAmount,String color) {   //classla ayni isim , constructor yazim sekli
		
		System.out.println("Yapici blok calisti");
		this._id = _id;
		this._description=_description;
		this._name=_name;
		this._price=_price;
		this._stockAmount=_stockAmount;
		this.color=color;
		
	}
	
	//attribute | field
	private int _id;   //alt cizgi koymadan daha guzel getter setter oluyo
	private String _name;
	private String _description ;
	private double _price ;
	private int _stockAmount ;
	private String color;
	private String code ;
	
	//getter
	public int getId() {
		
		return _id;
	}
	
	//setter
	public void setId(int id) {  //degeri kuruyo bi sey vermiyo ondan void
		//this.id = id;  // this li olan Product class'i , id de int id olan (boyle de yazilabilir)
		_id=id; // yaygin kullanimi
		
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double _price) {
		this._price = _price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {  //yazilabilir olmasini istemiyosan setter kullanma
		this.color = color;  //gibi
	}

	public String getCode() {
		return this._name.substring(0, 1)+ _id;
	}

	
	
	
	
	
}

