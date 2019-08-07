package AlphaMobile;

public class Smart6 extends Phone{
	private	String phone;
	//private	String location;
	private int price;
	
	
	public Smart6(){
		this.setLabel("Smart 6"); //Initializes the phone type
	}
	@Override
	public void setLabel(String phone){ //Sets the phone model type
		this.phone = phone;
	}
	
	@Override
	public void setPrice(){ //Sets the price
		this.price = 600;
	}
	
	@Override
	public String getLabel(){ //Returns the phone model
		return this.phone;
	}
	@Override
	public int getPrice(){ //Returns the price
		return this.price;
	}
	
	
	@Override
	public void displayInfo(){ //Displays the assembled phone info
		System.out.println("Model: " + phone + "\nPrice: $" + 600);
	}
}
