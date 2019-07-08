package MembershipCard;

import java.sql.ResultSet;
import java.sql.SQLException;

import ConnectionDB.UltraVisionDataBaseConnection;

public class MembershipCard {
       //globals membership card
	   private int points;
	   private boolean freeRentAllowed;
	   
	   
	   public MembershipCard(int points, boolean freeRentAllowed) {
		   //constructor
		  this.points = points;
		  this.freeRentAllowed = freeRentAllowed;
	   }
	   
	   public void addPoints(int points){
		   //add points to the membership card
			this.points += points;
			setRentAllowed();
	   }
	   
	   public boolean availFreeRent(){
		   //if a free rent is allowed removes 100 points from the card
			if(this.isfreeRentAllowed()){
				this.points -= 100;
				setRentAllowed();
				return true;
			} else {
				return false;
			}
	   }
	   
	   private void setRentAllowed(){
		   //if the card reaches 100 points allows the free rent
			if (this.points >= 100){
				this.freeRentAllowed = true;
			} else {
				this.freeRentAllowed = false;
			}
	   }
	   
	   public int getPoints() {
		   //get points
/*		   
		   UltraVisionDataBaseConnection db = new UltraVisionDataBaseConnection();
	    	String query = "SELECT * FROM ultravisiondb.customer where (C_ID = '3');";
	    	
	    	db.select(query);
	    	ResultSet rs = db.getRs();
	    	int data = 0;
	    	
	    	try {
                 data = rs.getInt("C_LoyaltyPoints");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	db.closingAll();
	 */   	
		   
			return  points;
    }
	   
	   public boolean isfreeRentAllowed(){
		   //boolean true allows the free rent
			return freeRentAllowed;
	   
	   }
	   
}
