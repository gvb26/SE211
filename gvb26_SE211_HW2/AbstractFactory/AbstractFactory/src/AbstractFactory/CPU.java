package AbstractFactory;

public abstract class CPU {
	public abstract String getCPU(); //Returns cpu info
	
	public abstract void displayInformation(); //Displays product tier information
	
	public abstract int getCCost(); //Returns product tier price
	
	public String getString(){
		return "CPU" + this.getCPU(); //Returns product type
	}
}
