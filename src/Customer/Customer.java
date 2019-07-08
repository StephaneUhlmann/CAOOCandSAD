package Customer;

import Enum.SubscriptionTypes;

public abstract class Customer {

	//Customer global
	protected String Name;
	protected final int MembershipNumber;
	private static int msCounter;
	private SubscriptionTypes SubscriptionType;

	public Customer(SubscriptionTypes SubscriptionType) {
		//Constructor 
		this.SubscriptionType = SubscriptionType;
		this.MembershipNumber = msCounter++;
	}

	public String getName() {
		//get Customer Name
		return Name;
	}

	public void setName(String name) {
		//set Customer Name
		Name = name;
	}

	public static int getMsCounter() {
		//Counter for membership number
		return msCounter;
	}

	public static void setMsConter(int msCounter) {
		//Counter for membership number
		Customer.msCounter = msCounter;
	}

	public int getMembershipNumber() {
		//get membership number
		return MembershipNumber;
	}
	public String toString() { 
		//String query for the database
		return "INSERT INTO `ultravisiondb`.`customer` (`C_Name`, `C_Subscription`, `C_MembershipCard`, `C_LoyaltyPoints`) VALUES ('"+ Name +"', '"+ SubscriptionType +"', '"+ MembershipNumber +"', '0');";
	}
	
	
	public SubscriptionTypes getSubscriptionType(){
		//get Subscription Type
		return SubscriptionType;
	}
	
	public void setSubscriptionType(SubscriptionTypes SubscriptionType) {
		//set Subscription Type
		this.SubscriptionType = SubscriptionType;
		
	}
	
	
}
