package AbstractFactory;

public class StandardCPU extends CPU {

	private String cpu;
	
	public StandardCPU(){
		this.setCPU("Standard"); //Sets type 
	}
	
	@Override
	public void displayInformation() {
		System.out.println("CPU Type: " + cpu); //Returns product tier
	}
	
	public void setCPU(String cpu) {
		this.cpu = cpu; //Sets string to private variable
	}
	
	@Override
	public int getCCost(){
		return 250; //Arbitrary cost
	}
	
	public String getCPU(){
		return this.cpu; //returns variable above
	}
}
