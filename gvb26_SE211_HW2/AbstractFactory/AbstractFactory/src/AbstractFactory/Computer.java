package AbstractFactory;

public class Computer {
	private CPU _cpu;
	private Monitor _monitor;
	private Keyboard _keyboard;
	private int cost;
	
	public Computer(ComputerPartsFactory ComputerPartsFactory){ //Constructor
		_cpu = ComputerPartsFactory.createCPU();
		_monitor = ComputerPartsFactory.createMonitor() ;
		_keyboard = ComputerPartsFactory.createKeyboard();
	}
	
	public void displayMonitorInfo(){
		 _monitor.displayInformation(); //Monitor info
	}
	
	public void displayCPUInfo(){
		_cpu.displayInformation(); //CPU info
	}
	
	public void displayKeyboardInfo(){
		_keyboard.displayInformation(); //Keyboard info
	}
	
	//Adds up the total cost for each component of the computer
	public void displayCost(){
		cost = _monitor.getMCost() + _cpu.getCCost() + _keyboard.getKCost();
		System.out.println("Cost: $"+cost);
	}
}
