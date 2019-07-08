package Customer;

import Enum.SubscriptionTypes;

//Class extends Customer and implements LoverInterface
public class VideoLover extends Customer implements LoverInterface{

	public VideoLover(SubscriptionTypes SubscriptionType) {
		super(SubscriptionType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		//String query for the database
		return "SELECT * FROM ultravisiondb.title where T_Active = 1 and T_Type = 'DVD';";
	}

}
