package AlphaMobile;

public class Smart4 extends Phone{
	private	String phone;
	//private	String location;
	private int price;
	
	
	public Smart4(){
		this.setLabel("Smart 4"); //Initializes the phone type
	}
	@Override
	public void setLabel(String phone){ //Sets the phone model type
		this.phone = phone;
	}
	
	@Override
	public void setPrice(){ //Sets the price
		this.price = 400;
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
		System.out.println("Model: " + phone + "\nPrice: $" + 400);
	}
	
}
