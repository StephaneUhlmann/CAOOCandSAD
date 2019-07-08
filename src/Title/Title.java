package Title;

import java.util.ArrayList;

import ConnectionDB.UltraVisionDataBaseConnection;

public abstract class Title {
 //globals for title
	protected String TitleName;
	protected int titleYear;
	protected boolean isAvailable;
	private ArrayList<String> rent;
	
	public String getTitleName() {
		//get title name
		return TitleName;
	}
	
	public void setTitleName(String titleName) {
		//set title name
		TitleName = titleName;
	}
	
	public int getTitleYear() {
		//get title year
		return titleYear;
	}
	
	public void setTitleYear(int titleYear) {
		//set title year
		this.titleYear = titleYear;
	}
	
	public boolean isAvailable() {
		//get title availability (is rented or not)
		return isAvailable;
	}
	
	public void setAvailable(boolean isAvailable) {
		//set title availability
		this.isAvailable = isAvailable;
	}
	
	
	//######################################################################################
	
	public ArrayList<String> rent(){
		return rent;
	}
	
	
	/*
	
	@Override
	public boolean isAvailableToRent() {
		// TODO Auto-generated method stub
       UltraVisionDataBaseConnection db = new UltraVisionDataBaseConnection();
    	
       String query = "SELECT * FROM ultravisiondb.title where T_Active = 1;";
    	db.select(query);
    	db.closingAll();
		
		return true;
	}

	@Override
	public boolean rent() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}

*/

	
}
