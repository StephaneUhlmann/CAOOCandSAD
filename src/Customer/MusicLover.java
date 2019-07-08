package Customer;

import Enum.SubscriptionTypes;

//Class extends Customer and implements LoverInterface
public class MusicLover extends Customer implements LoverInterface{
		
	public MusicLover(SubscriptionTypes SubscriptionType) {
		super(SubscriptionType);

	}

	@Override
	public String toString() { 
		//String query for the database
		return "SELECT * FROM ultravisiondb.title where T_Active = 1 and T_Type = 'CD';";
	}

}
