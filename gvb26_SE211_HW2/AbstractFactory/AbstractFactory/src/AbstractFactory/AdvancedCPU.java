package AbstractFactory;

public class AdvancedCPU extends CPU {
	private String cpu;
	
	public AdvancedCPU(){
		this.setCPU("Advanced"); //Sets to advanced
	}
	
	@Override
	public void displayInformation() {
		System.out.println("CPU Type: " + cpu); //Displays product tier	
	}
	
	@Override
	public int getCCost(){
		return 400; //Arbitrary cost 
	}
	
	public void setCPU(String cpu) {
		this.cpu = cpu; //Simply sets the CPU to the private variable
	}
	
	@Override
	public String getCPU(){
		return this.cpu; //Returns the above string
	}
	
	
}
