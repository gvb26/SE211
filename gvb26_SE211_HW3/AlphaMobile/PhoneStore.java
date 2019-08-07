package AlphaMobile;
import java.util.Scanner;

public class PhoneStore {
	private static AlphaMobileFactory selection;
	private static Phone _phone;
	public static void displayPhone(String location, String type){
		if(location.equals("Singapore")){
			selection = new SingaporeFactory();
			_phone = selection.assemblePhone(type);
		}
		else if(location.equals("New York")){
			selection = new NewYorkFactory();
			_phone = selection.assemblePhone(type);
		}
		_phone.displayInfo();
	}
	
	public static void main(String[] args){
		System.out.println("New York or Singapore?”);
		Scanner reader1 = new Scanner(System.in);
		String location = reader1.nextLine();
		
		System.out.println("Which model would you like?");
		Scanner reader2 = new Scanner(System.in);
		String type = reader2.nextLine();
		//
		
		displayPhone(location, type);
		reader1.close();
		reader2.close();
	}
}
