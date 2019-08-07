package AbstractFactory;

public abstract class Monitor {
	
	public abstract String getMonitor(); //get method for returning the monitor
	
	public abstract void displayInformation(); //Displays product information
	
	public abstract int getMCost(); //Returns cost for the product tier
	
	public String getString(){
		return "Monitor:" + this.getMonitor(); //Returns monitor type
	}
	
}
