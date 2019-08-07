package AbstractFactory;
//Abstract Factory
public interface ComputerPartsFactory {
	public CPU createCPU();
    //creates CPU
	
	public Monitor createMonitor();
	    //creates monitor
	  
	public Keyboard createKeyboard();
		//creates Keyboard  
	  
}
