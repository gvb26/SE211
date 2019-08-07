package AbstractFactory;

public class AdvancedMonitor extends Monitor {
	private String monitor;
	
	public AdvancedMonitor(){
		this.setMonitor("Advanced"); //Sets type
	}
	
	@Override
	public void displayInformation() {
		System.out.println("Monitor Type: " + monitor); //Displays product tier
	}
	
	public void setMonitor(String monitor) {
		this.monitor = monitor; //Assigns to private variable
	}
	
	@Override
	public int getMCost(){
		return 100; //Arbitrary cost
	}
	
	public String getMonitor(){
		return this.monitor; //Returns above variable
	}
}
