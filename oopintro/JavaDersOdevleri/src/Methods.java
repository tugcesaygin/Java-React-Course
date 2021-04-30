
public class Methods {

	public static void main(String[] args) {

		sayiBulmaca(); // method'u main'de cagirdik ben main yerine methods yazdim ama o main.
	}                  //fonksiyonlarla tekrarlama onlenir tek bir yerde yazilip her yerde cagirilabilir.
	
	public static void sayiBulmaca() {  //method yazilimi
		
		int[] nums = new int[] {1,2,5,7,9,0};
		int search = 10;
		boolean varMi= false;
		
		for(int num : nums) {
			if (num==search) {
				varMi=true;
				break;
			}
		}
		
		if(varMi) {
			giveMessage("Number found: " +search); // ifade verilmek zorunda. number found ve search ikisi tek bir parametre bu arada
		}
		else {
			giveMessage("Number not found: " +search);
		}   
		

	}
		public static void giveMessage(String message) { //camelCasing once kucuk harf sonra buyuk harf / parametreli metot
			
			System.out.println(message);
			

		}
	
	
		
	}


