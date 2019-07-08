package Title;

import Enum.MediaTypes;

public interface MediaInterface {

	//interface implements the methods
	public String toString();

	public MediaTypes getMediaType();

	public void setMediaType(MediaTypes MediaType);
	
	public double getprice();
	
	public void setprice(double price);
		
}
