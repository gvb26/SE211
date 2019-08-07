package AbstractFactory;

public abstract class Keyboard {
	
	public abstract String getKeyboard(); //Returns keyboard info
	
	public abstract void displayInformation(); //Displays product tier info
	
	public abstract int getKCost(); //Returns product tier price
	
	public String getString(){
		return "Keyboard:" + this.getKeyboard(); //Returns product type
	}
}
