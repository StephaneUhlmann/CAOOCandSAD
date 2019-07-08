package Enum;

public enum SubscriptionTypes {
	
	//enum types of Subscription
	MUSICLOVER,
	TVLOVER,
	VIDEOLOVER,
	PREMIUM;

	private int types;

	public int getTypes() {
		//get type
		return types;
	}

	public void setTypes(int types) {
		//set type
		this.types = types;
	}


}
