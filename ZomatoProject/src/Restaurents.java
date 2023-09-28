 /**
     * this is the implementation of the class Restaurents
	 * to get all the Address with
	 * parameters
	 * @param restaurent name
	 * @param restaurent location
	 * @param review
	 */
public class Restaurents{
    public String restaurent_name;
    public String restaurent_location;
    public double restaurent_review;

	/**
	 * To create a constructor with arguments for the Restaurent class.
	 * @param restaurent name
	 * @param restaurent location
	 * @param review
	 */
   public Restaurents(String restaurent_name,String restaurent_location,double restaurent_review) {
	   this.restaurent_name=restaurent_name;
	   this.restaurent_location=restaurent_location;
	   this.restaurent_review=restaurent_review;
   }
    /**
	 * override the default toString method of Restaurents so that Restaurent info 
	 * can be printed in human readable format
	 */
	@Override

   public String toString() {
	   String restaurent=" ";
	   restaurent+="Restaurent Name      : " + this.restaurent_name+"\n";
	   restaurent+="Restaurent Location  : " + this.restaurent_location+"\n";
	   restaurent+="Restaurent Review    : " + this.restaurent_review+"\n";

	   return restaurent;
	   
   }
}
