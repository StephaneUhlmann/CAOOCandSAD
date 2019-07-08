package Title;

import Enum.MediaTypes;

public class Media extends Title implements MediaInterface {

	//globals media
private MediaTypes MediaType;
private double price;
	
	public Media(MediaTypes MediaType, double price) {
		//constructor
		this.MediaType = MediaType;
		this.price = price;
		
	}
	
	@Override
	public String toString() { 
		//string query for the database
		return "INSERT INTO `ultravisiondb`.`title` (`T_Name`, `T_Type`, `T_Year`, `T_Active`) VALUES ('" + TitleName + "', '" + MediaType + "', " + titleYear + ", '1');";
	}

	@Override
	public MediaTypes getMediaType() {
		//get media type
		return MediaType;
	}

	@Override
	public void setMediaType(MediaTypes MediaType) {
		//set media type
		this.MediaType = MediaType;
	}

	@Override
	public double getprice() {
		//get price
		return price;
	}

	@Override
	public void setprice(double price) {
		//set price
		this.price = price;
	}


}
