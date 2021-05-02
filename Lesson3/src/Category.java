
public class Category {

	private int id;
	private String name;  //once fieldlar sonra constructor sonra metotlar gelir.
	
	public Category() {
		
	}
	
	public Category(int id, String name) {
		super();  // bos constructor'i calistiriyo base'i yani
		this.id = id;
		this.name = name;
	}
	
	

	public int getId() {
		return id;
	}
	
	public void setId(int id) {  //bi sey dondurmicem bi sey yapica demek void. set edilecek parametreyi gir.
		this.id = id;
		
	}
	
	public String getName(){
		return name + "!";  //getter ve setterlar sayesinde her yerde degistirmek yerine tek yerden degisim yapilabilir.
		
	}
	
	public void setName(String name) {
		this.name =  name; 
	}
	
}
