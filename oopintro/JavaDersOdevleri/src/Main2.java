
public class Main2 { //Methods 2 aslinda

	public static void main(String[] args) {
		
		String message= "Today the weather is good.";
		String newMessage = message.substring(0, 2); // bellekte olusan message degerini newMessage a attik boylece degeri gostermis olduk/ substring bir deger dondurur.
		String mMessage = city();
		System.out.println(newMessage);
		System.out.println(mMessage);  //hepsi kend degerinde donuyo
		
		int num = topla(5,7);
		System.out.println(num);
		
		int total = add2(2,5,14,58);
		System.out.println(total);
		

	}
	

	public static void add() {
		System.out.println("added");
	}
	
	
	public static void delete() { // void operasyonu bir sey yapmasini istiyosun o anlama geliyo

		System.out.println("deleted");
	}
	
	
	public static void upload() {
		
		System.out.println("uploaded");
		
	}
	
	public static int topla(int num1 , int num2) { // bu fonk int degerinde bir deger dondurur demek
		
		return num1+num2;
		
	}
	
	
	public static int add2(int... numbers) {  // birden fazla integer gondercem demek icin ... konur. Integer array gibi calisir
		int total = 0;
		for ( int num : numbers) {   //maindeki main e ait total burdaki add2'ye ait toplam yani total
			
			total+=num;
		}
		return total;
	}
	
	
	
	public static String city() {
		return "NewYork";
	}
	
	
	
	
}
