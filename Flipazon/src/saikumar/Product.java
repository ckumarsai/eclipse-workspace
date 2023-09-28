package saikumar;
import java.util.*;

import com.innominds.flipazon.Entity.dependencies.Rating;

/**
 * This is an implementation of a class "Product" to represent a product in my
 * implementation of e-commerce application.
 * @author saikumar1
 *
 */

public class Product {
	
	private static int	id_counter = 4567;
	public static int found=0;
	private static HashSet<Product> listOfProducts = new HashSet<Product>();
	
	public String 		id;
	String 				name;
	float				price;
	String				description;
	
	ArrayList<Rating>	ratings;
	
	// basic constructor
	public   Product(String name, String description, float price) throws Exception {
		
		// verify input data, if input is bad, throw exception
		if (name.trim().length() < 2) {
			throw new Exception("name is too short");
		} else if (description.trim().length() < 10) {
			throw new Exception("description is too short");
		} else if (price < 1) {
			throw new Exception("price is too low or negative");
		} else {
			// initializing instance things
			this.id = ++id_counter + "";
			this.name = name;
			this.description = description;
			this.price = price;
			this.ratings = new ArrayList<Rating>();
			
			// adding newly created instance to static listOfProducts
			listOfProducts.add(this);
		}
	}
}
	
	



