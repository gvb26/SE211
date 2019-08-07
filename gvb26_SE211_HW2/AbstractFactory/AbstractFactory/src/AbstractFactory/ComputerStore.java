package AbstractFactory;

import java.util.Scanner;

public class ComputerStore {
	
	private static ComputerPartsFactory computerPartsFactory;
	
	private static Computer _computer;
	
	//More or less the same code from the homework assignment
	public static void displayComputer(String type){
		if (type.equals("Standard")){
			computerPartsFactory = new StandardComputerPartsFactory();
		}
		else if (type.equals("standard")){
			computerPartsFactory = new StandardComputerPartsFactory();
		}
		else if (type.equals("Advanced")){
			computerPartsFactory = new AdvancedComputerPartsFactory();
		}
		else if (type.equals("advanced")){
			computerPartsFactory = new AdvancedComputerPartsFactory();
		}
		else{
			System.out.println("Invalid Entry"); //Only Standard or Advanced computers at this store
		}
		_computer = new Computer(computerPartsFactory);
		
		//Displays all information for each type 
		_computer.displayMonitorInfo();
		_computer.displayCPUInfo();
		_computer.displayKeyboardInfo();
		_computer.displayCost();
	}
	
	//Driver function
	public static void main(String[] args){
		System.out.println("Standard or Advanced?");
		Scanner reader = new Scanner(System.in);
		String input = reader.next();
		
		displayComputer(input);
		
		reader.close();
	}
}
