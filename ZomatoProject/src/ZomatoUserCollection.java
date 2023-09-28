import java.util.ArrayList;

public class ZomatoUserCollection {
	/**
	 * Creating a UserCollection class to implement the UserCollection by using
	 * ArrayList
	 * @author ziya1
	 */
	ArrayList<ZomatoUser> listofAllZomatousers = new ArrayList<ZomatoUser>();

	/**
	 * To create CreateNewZomatoUser method using parameters by using ArrayList and
	 * newZomatoUser object and passing the parameters 
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
	 * @return
	 */

	public boolean CreateNewZomatoUser(String name, int id, String email, String phno, String location,
			Address[] address, Restaurents[] restaurent, String[] vegitems, String[] nonVegItems, String[] tiffins,
			String[] snacks, String[] sweets, String[] fastFood, String price) {
		ZomatoUser newUser = new ZomatoUser(name, id, email, phno, location, address, restaurent, vegitems, nonVegItems,
				tiffins, snacks, sweets, fastFood);
		this.listofAllZomatousers.add(newUser);
		return true;
	}

	/**
	 * This was the helper Arraylist of type ZomatoUser method for finding the
	 * matched user by "LIST OF FOOD ITEMS". by passing food items but any one of
	 * the fooditem is present it should display the respective restraunts nd all
	 * food items
	 * @param fooditems
	 * @return selected set
	 */

	public ArrayList<ZomatoUser> getMatchbydish(String[] dish) {
		ArrayList<ZomatoUser> getdish = new ArrayList<ZomatoUser>();
		System.out.println("                 Matched Chicken biryani Restaurents              ");
		System.out.println("============================================================");
		for (int i = 0; i < this.listofAllZomatousers.size(); i++) {
			ZomatoUser newuserfound = this.listofAllZomatousers.get(i);
			for (int j = 0; j < newuserfound.nonVegItems.length; j++) {
				for (int k = 0; k < dish.length; k++) {
					if (newuserfound.nonVegItems[j] == dish[k]) {
						getdish.add(newuserfound);
					}
				}
			}
		}
		return getdish;
	}

	/**
	 * This was the helper Arraylist of type ZomatoUser method for finding the
	 * matched user by "LIST OF RESTAURENTS". by passing restraunt but any one of
	 * the restaurents is present it should display the respective food items 
	 * @param restaurents
	 * @return selected set
	 */

	public ArrayList<ZomatoUser> getRestaurentname(String string) {
		ArrayList<ZomatoUser> selectedSet = new ArrayList<ZomatoUser>();

		System.out.print("======================== " + string + "Restaurent==================");

		// looking at all the users in UserCollection
		for (int i = 0; i < listofAllZomatousers.size(); i++) {

			ZomatoUser currentUser = listofAllZomatousers.get(i);
			Restaurents[] restaurent = currentUser.restaurent;
 			for (int j = 0; j < restaurent.length; j++) {

				Restaurents currRestaurent = restaurent[j];
				if (currRestaurent.restaurent_name.contains(string)) {
					selectedSet.add(currentUser);
				}
			}
		}
		return selectedSet;
	}
	
//	public ArrayList<ZomatoUser> getPrice(double minprice, double maxprice){
//		ArrayList<ZomatoUser> selectedset=new ArrayList<ZomatoUser>();
//		System.out.println("Between the price");
//		for(ZomatoUser currentUser : listofAllZomatousers) {
//			if(currentUser.getPrice()<=maxprice &&  currentUser.getPrice()>=minprice)
//				selectedset.add(currentUser);
//		}
//		return selectedset;
//		
//	}
	
//	public ArrayList<ZomatoUser> getBetweenPrice(double minprice, double maxprice){
//		ArrayList<ZomatoUser> selectedset=new ArrayList<ZomatoUser>();
//		System.out.println("Between the price");
//		for(ZomatoUser currentUser : listofAllZomatousers) {
//			if(currentUser.getPrice()<=maxprice &&  currentUser.getPrice()>=minprice)
//				selectedset.add(currentUser);
//		}
//		return selectedset;
//		
//	}
}
