     /**
     * this is the implementation of the class Address
	 * to get all the Address with
	 * parameters
	 * @param house no
	 * @param flatname
	 * @param landmark
	 * @param street
	 * @param city
	 * @param district
	 * @param state
	 * @param country
	 * @param pincode
	 */
public class Address {
   private String houseno;
   private String flatname;
   private String landmark;
   private String street;
   private String city;
   private String district;
   private String state;
   private String country;
   private String pincode;
   

	/**
	 * To create a constructor with arguments for the Address class.
	 * @param house no
	 * @param flatname
	 * @param landmark
	 * @param street
	 * @param city
	 * @param district
	 * @param state
	 * @param country
	 * @param pincode
	 */
   public Address(String houseno,String flatname,String landmark,String street,String city,String district,String state,String country,String pincode) {
	   this.houseno=houseno;
	   this.flatname=flatname;
	   this.landmark=landmark;
	   this.street=street;
	   this.city=city;
	   this.district=district;
	   this.state=state;
	   this.country=country;
	   this.pincode=pincode;
   }
    /**
	 * override the default toString method of Address so that address  
	 * can be printed in human readable format
	 */
	@Override

   public String toString() {
	   String address=" ";
	   address+="Houseno    : " + this.houseno+"\n";
	   address+="Flatname   : " + this.flatname+"\n";
	   address+="Landmark   : " + this.landmark+"\n";
	   address+="street     : " + this.street+"\n";
	   address+="City       : " + this.city+"\n";
	   address+="District   : " + this.district+"\n";
	   address+="State      : " + this.state+"\n";
	   address+="Country    : " + this.country+"\n";
	   address+="Pincode    : " + this.pincode+"\n";
	   return address;
	   
   }
}
