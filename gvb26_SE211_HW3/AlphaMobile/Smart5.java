package AlphaMobile;

public class Smart5 extends Phone{
	private	String phone;
	//private	String location;
	private int price;
	
	
	public Smart5(){
		this.setLabel("Smart 5"); //Initializes the phone type
	}
	@Override
	public void setLabel(String phone){ //Sets the phone model type
		this.phone = phone;
	}
	
	@Override
	public void setPrice(){ //Sets the price
		this.price = 500;
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
		System.out.println("Model: " + phone + "\nPrice: $" + 500);
	}
}
