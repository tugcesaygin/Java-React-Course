package begin;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		// don't repeat yourself yazdigin kodu farkli yerlerde degistirmek zorunda 
		//kalmamak icin degisken icinde tut. boylece bir yerde degisim yapman yetecektir.
		
		String internetButton = "Internet Butonu";
		double dolarYesterday = 8.20;
		double dolarToday = 8.20;
		int vade = 36;
		boolean isItFall = false;
	
		System.out.println(internetButton);
		
		if(dolarToday<dolarYesterday) {
			
			System.out.println("Dolar Down");
			
		}
		
		else if(dolarToday>dolarYesterday) {
			
			System.out.println("Dolar High");
			
		}
		
		else {
			
			System.out.println("Dolar is equal");
			
		}
		
		String credit1 = "Fast Credit";
		String credit2 = "Happy Retired Credit";
		String credit3 = "House Credit";
		String credit4 = "Farmer Credit";
		String credit5 = "MSB Credit";
		
		System.out.println(credit1);
		System.out.println(credit2);
		System.out.println(credit3);
		System.out.println(credit4);
		System.out.println(credit5);
		
		//youkaridaki string tanimiyla ayni olayi yapiyor.Alttaki tanimlma 
		//sekliyle daha rahat veri tanimliyoruz diger turlu zor.dinamik degildir.
		
		String[] credits = 
			{
					"Fast Kredi",
					"Happy Retired Credit",
					"House Credit", 
					"Farmer Credit",
					"MSB Credit",
					"Meb Credits"
			};
		
		//foreach dongusu
		for(String credit : credits ) { //benim elimde bir dizi var o dizinin elemanlarini tek tek dolas demek bu satir.
			
			System.out.println(credit); //sirayla gezer
			
		}
		
		for(int i=0 ; i<credits.length ; i++) { //yukaridakiyle ayni islemi yapar
			
			System.out.println(credits[i]); //istedigimiz elemana ulasmak icin [] kullaniriz.
			
		}
		
		
		
		int num1 = 10;
		int num2 = 20;
		num1=num2;
		num2 = 100;
		System.out.println(num2);
		
		int[] nums1 = {1,2,3,4,5};
		int[] nums2 = {10,20,30,40,50};
		nums1=nums2;
		nums2[0] = 100; 
		System.out.println(nums1[0]);
		
		
		String city1 = "Ankara";
		String city2= "Istanbul";
		city1 = city2;
		city2 = "Izmir";  //Stringlerde istisnai durum. Referans da olsalar deger gibi calisiyolar
		
		System.out.println(city1);
		
		
	

	}

}
