import java.util.ArrayList;
import java.util.Scanner;

public class ZomatoHomePage {
	String mobilenumber;
	public static void main(String[] args) {
	
		Address home_address = new Address("1-4/A", "Meghalaya", "near Q city", "Indira Nagar", "karimnagar",
				"Hyderabad", "TS", "India", "535353");
		Address office_address = new Address("1-2/z", "Sirivennala", "near paradise", "Ameerpet", "Siddipet",
				"Hyderabad", "TS", "India", "535353");
		Restaurents res1 = new Restaurents("Paradise", "Gachibowli", 4.5);
		Restaurents res2 = new Restaurents("Platform 65", "KPHB", 4.7);
		Restaurents res3 = new Restaurents("Bewarchi", "Gachibowli", 3.8);
		Restaurents res4 = new Restaurents("Spicy paradise", "Visakhapatnam", 4.2);
		Restaurents res5 = new Restaurents("Sukhibava hotel", "Waverock", 3.6);
		Restaurents res6 = new Restaurents("Ks Bakery", "Gachibowli indira nagar", 4.9);
		Restaurents res7 = new Restaurents("KGN Bakery", "Gachibowli", 3.8);
		Restaurents res8=new Restaurents("CakeWalkers", "manikonda",4.3);
		
//		Scanner scn=new Scanner(System.in);
//		
//		System.out.print("Enter a choice:\n");
//		int scns=scn.nextInt();
		
//		System.out.println("press 2:matched restaurents and food");
//		int choice=scn.nextInt();
		
		

		ZomatoUserCollection z= new ZomatoUserCollection();

		/**
		 * user collection object calling createNewBlunderUser method by passing the
		 * parameters 
		 * @param name
		 * @param id
		 * @param email
		 * @param phno
		 * @param location
		 * @param address
		 * @param restaurent
		 * @param vegitems
		 * @param nonVegItems
		 * @param tiffins
		 * @param snacks
		 * @param sweets
		 * @param fastFood
		 */
		
		z.CreateNewZomatoUser("Ziya", 123, "ziya@gmail.com", "9393939392", "Hyderabad", new Address[] { home_address },
				new Restaurents[] { res1 }, new String[] { "Paneer Biryani", "Mushroom Biryani", "Veg Biryani" },
				new String[] { "Chicken Biryani", "Mutton Biryani", "Chicken dum Biryani" },
				new String[] { "Not avilable" }, new String[] { "Egg puff", "Biscuits", "samosa" },
				new String[] { "laddu", "Gulab jamun", "Putharekulu" },
				new String[] { "Eggfriedrice", "Chicken fried rice", "chicken manchurian" }, null);

		z.CreateNewZomatoUser("Ashok", 456, "ashok@gmail.com", "7362548291", "Guntur",
				new Address[] { home_address, office_address }, new Restaurents[] { res4 },
				new String[] { "Paneer Tikka", "kaju curry", "Veg Biryani" },
				new String[] { "Chicken fry Biryani", "Chicken Magestic", "Mutton keema" },
				new String[] { "vada", "idly", "Onion dosa" }, new String[] { "Not available" },
				new String[] { "Not available" },
				new String[] { "Eggfriedrice", "Chicken fried rice", "chicken manchurian" }, null);

		z.CreateNewZomatoUser("Sai", 789, "sai@gmail.com", "7354358912", "Karimnagar", new Address[] { office_address },
				new Restaurents[] { res5 }, new String[] { "Not available" }, new String[] { "Not avilable" },
				new String[] { "Plane dosa", "Bonda", "puri" }, new String[] { "Not Available" },
				new String[] { "Not available" },
				new String[] { "Eggfriedrice", "Chicken fried rice", "chicken manchurian" }, null);
		z.CreateNewZomatoUser("Anil", 987, "anil@gmail.com", "8752338392", "Tuni", new Address[] { home_address },
				new Restaurents[] { res6, res7 }, new String[] { "Not Available" }, new String[] { "Not Available" },
				new String[] { "Not avilable" }, new String[] { "Egg puff", "Biscuits", "samosa" },
				new String[] { "laddu", "Gulab jamun", "Putharekulu" }, new String[] { "Not Available" }, null);
		z.CreateNewZomatoUser("Priya", 654, "priya@gmail.com", "6538358922", "Nellore", new Address[] { home_address },
				new Restaurents[] { res4 }, new String[] { "Paneer Biryani", "Mushroom Biryani", "Veg Biryani" },
				new String[] { "Chicken fry Biryani", "Mutton Biryani", "Chicken dum Biryani" },
				new String[] { "Not avilable" }, new String[] { "Not available" }, new String[] { "Not available" },
				new String[] { "Eggfriedrice", "Chicken fried rice", "chicken manchurian" }, null);

		z.CreateNewZomatoUser("Yashu", 321, "yashu@gmail.com", "7353452373", "Bhimavaram",
				new Address[] { home_address, office_address }, new Restaurents[] { res6 },
				new String[] { "Paneer Biryani", "Mushroom Biryani", "Veg Biryani" },
				new String[] { "Chicken Biryani", "Mutton Biryani", "Chicken dum Biryani" },
				new String[] { "Not avilable" }, new String[] { "Egg puff", "Biscuits", "samosa" },
				new String[] { "laddu", "Gulab jamun", "Putharekulu" },
				new String[] { "Eggfriedrice", "Chicken fried rice", "chicken manchurian" }, null);
		
//		int choice = 0;
//		if(choice==1) {
//			System.out.println("to validate otp enter mobilenumber");
//			String scns1=scn.nextLine();
			Newotp n=new Newotp();
			n.generateOtp();
		
//		else if(choice==2) {
		ArrayList<ZomatoUser> r1 = z.getMatchbydish(new String[] { "Chicken Biryani" });
		System.out.println(r1);
		System.out.println(" Total Names matched:" + r1.size());
//		}
		
		
//		else if(choice==3) {
		ArrayList<ZomatoUser> r2 = z.getRestaurentname("Paradise");
		System.out.print(r2);
		System.out.print("Total Matched:" + r2.size());
//		}
		
		
	}

}

