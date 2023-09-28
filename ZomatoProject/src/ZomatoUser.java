/**
 * this is the implementation of the class User Details to get all the user
 * details with parameters
 * @param username
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
 * @author ziya1,Ashok,Sai
 */

public class ZomatoUser {
	@SuppressWarnings("unused")
	private String username;
	@SuppressWarnings("unused")
	private int id;
	@SuppressWarnings("unused")
	private String email;
	@SuppressWarnings("unused")
	private String phno;
	@SuppressWarnings("unused")
	private String location;
	Address[] address;
	String[] foodItems;
	Restaurents[] restaurent;
	String[] vegItems;
	String[] nonVegItems;
	String[] tiffins;
	String[] snacks;
	String[] sweets;
	String[] fastFood;
	private double price;

	
	

	/**
	 * To create a constructor with arguments for the UserDetails class.
	 * @param username
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

	public ZomatoUser(String name, int id, String email, String phno, String location, Address[] address,
			Restaurents[] restaurent, String[] vegitems, String[] nonVegItems, String[] tiffins, String[] snacks,
			String[] sweets, String[] fastFood) {
		this.username = name;
		this.id = id;
		this.email = email;
		this.phno = phno;
		this.location = location;
		this.address = address;
		this.restaurent = restaurent;
		this.vegItems = vegitems;
		this.nonVegItems = nonVegItems;
		this.tiffins = tiffins;
		this.snacks = snacks;
		this.sweets = sweets;
		this.fastFood = fastFood;
//		this.setPrice(price);
		//System.out.println(this);
	}

	/**
	 * override the default toString method of zomato user so that users info can be
	 * printed in human readable format
	 */
	@Override
	public String toString() {
		String userdetails = "";

		/**
		 * This is the implimentaion of the arrays of Restaurent to insert the list of
		 * all restaurents
		 */

		String restaurentsString = "[";
		for (int i = 0; i < this.restaurent.length; i++) {
			restaurentsString += "\"" + this.restaurent[i] + "\" ";
		}
		restaurentsString += "]";
		userdetails += "Restaurents :   " + restaurentsString + "\n";

		/**
		 * This is the implimentation of the arrays of vegItems to insert the list of
		 * all vegitems
		 */

		String vegItemsString = "[";
		for (int i = 0; i < this.vegItems.length; i++) {
			vegItemsString += "\"" + this.vegItems[i] + "\" " + ",";
		}
		vegItemsString += "]";
		userdetails += "VegItems :   " + vegItemsString + "\n";

		/**
		 * This is the implimentation of the arrays of NonvegItems to insert the list of
		 * all nonVegItems
		 */
		String nonVegItemsString = "[";
		for (int i = 0; i < this.nonVegItems.length; i++) {
			nonVegItemsString += "\"" + this.nonVegItems[i] + "\" " + ",";
		}
		nonVegItemsString += "]";
		userdetails += "NonVegItems :   " + nonVegItemsString + "\n";

		/**
		 * This is the implimentation of the arrays of TiffinItems to insert the list of
		 * all tiffin items
		 */

		String tiffinsString = "[";
		for (int i = 0; i < this.tiffins.length; i++) {
			tiffinsString += "\"" + this.tiffins[i] + "\" " + ",";
		}
		tiffinsString += "]";
		userdetails += "Tiffins :   " + tiffinsString + "\n";

		/**
		 * This is the implimentations of the arrays of SnacksItems to insert the list
		 * of all snackitems
		 */

		String snacksString = "[";
		for (int i = 0; i < this.snacks.length; i++) {
			snacksString += "\"" + this.snacks[i] + "\" " + ",";
		}
		snacksString += "]";
		userdetails += "Snacks :   " + snacksString + "\n";

		/**
		 * This is the implimentation of the arrays of SweetsItems to insert the list of
		 * all sweetitems
		 */

		String SweetsString = "[";
		for (int i = 0; i < this.sweets.length; i++) {
			SweetsString += "\"" + this.sweets[i] + "\" " + ",";
		}
		SweetsString += "]";
		userdetails += "Sweets :   " + SweetsString + "\n";

		/**
		 * This is the implimentation of the arrays of Fastfood Items to insert the list
		 * of all fastfooditems
		 */

		String fastFoodString = "[";
		for (int i = 0; i < this.fastFood.length; i++) {
			fastFoodString += "\"" + this.fastFood[i] + "\" " + ",";
		}
		fastFoodString += "]";
		userdetails += "FastFood :   " + fastFoodString + "\n";

		System.out.println("=========================================================");

		return userdetails;
	}

//	public double getPrice() {
//		// TODO Auto-generated method stub
//		return price;
//	}
//
//
////
//	public void setPrice(double price) {
//		this.price = price;
//	}
}
