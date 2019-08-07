package AbstractFactory;


//Concrete Factory 1
public class AdvancedComputerPartsFactory implements ComputerPartsFactory {
	/*
	private String cpu;
	private String keyboard;
	private String monitor;
	
	public AdvancedComputerPartsFactory(){
		this.cpu=cpu;
		this.monitor=monitor;
		this.keyboard=keyboard;
	}
	
	public AdvancedComputerPartsFactory(String cpu, String monitor, String keyboard){
		this.cpu=cpu;
		this.monitor=monitor;
		this.keyboard=keyboard;
	}*/
	////The above was code that I had originally thought would be helpful but ended up hurting my code
	@Override
	public CPU createCPU(){
	    return new AdvancedCPU(); //Initializes the advanced CPU
	  }
	
	@Override
	public Monitor createMonitor(){
	    return new AdvancedMonitor(); //Initializes the advanced monitor
	  }
	
	@Override
	public Keyboard createKeyboard(){
		return new AdvancedKeyboard(); //Initializes the advanced keyboard
	  }
}
