package Customer;

import Enum.SubscriptionTypes;

//Class extends Customer and implements LoverInterface
public class TVLover extends Customer implements LoverInterface{

	public TVLover(SubscriptionTypes SubscriptionType) {
		super(SubscriptionType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		//String query for the database
		return "SELECT * FROM ultravisiondb.title where T_Active = 1 and T_Type = 'BOXSET';";
	}

}
