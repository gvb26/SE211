package AbstractFactory;

public class StandardMonitor extends Monitor {
	private String monitor;
	
	public StandardMonitor(){
		this.setMonitor("Standard"); //Sets type
	}
	
	@Override
	public void displayInformation() {
		System.out.println("Monitor Type: " + monitor); //Returns product tier
	}
	
	public void setMonitor(String monitor) {
		this.monitor = monitor; //Sets string to private variable
	}
	
	@Override
	public int getMCost(){ 
		return 50; //Arbitrary cost
	}
	
	public String getMonitor(){
		return this.monitor; //Returns above variable
	}
}
