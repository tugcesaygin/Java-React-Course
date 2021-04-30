
public class Main { //sayibulma

	public static void main(String[] args) {

		int[] nums = new int[] {1,2,5,7,9,0};
		int search = 6;
		boolean varMi= false;
		
		for(int num : nums) {
			if (num==search) {
				varMi=true;
				break;
			}
		}
		if(varMi) {
			System.out.println("Number found.");
		}
		else {
			System.out.println("Number is not here!");
		}
		
		

}
}
