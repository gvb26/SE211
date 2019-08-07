package AbstractFactory;
//Concrete Factory 2
public class StandardComputerPartsFactory implements ComputerPartsFactory {
	private String cpu;
	private String keyboard;
	private String monitor;
	/*
	public StandardComputerPartsFactory(){
		this.cpu=cpu;
		this.monitor=monitor;
		this.keyboard=keyboard;
	}
	
	public StandardComputerPartsFactory(String cpu, String monitor, String keyboard){
		this.cpu=cpu;
		this.monitor=monitor;
		this.keyboard=keyboard;
	}
	*/
	//The above was code that I had originally thought would be helpful but ended up hurting my code
	
	@Override
	public CPU createCPU(){
	    return new StandardCPU(); //Initializes the standard CPU
	  }
	
	@Override
	public Monitor createMonitor(){
	    return new StandardMonitor(); //Initializes the standard monitor
	  }
	
	@Override
	public Keyboard createKeyboard(){
		return new StandardKeyboard(); //Initializes the standard keyboard
	  }
}

