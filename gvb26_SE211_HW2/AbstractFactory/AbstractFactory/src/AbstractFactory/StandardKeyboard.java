package AbstractFactory;

public class StandardKeyboard extends Keyboard {
	private String keyboard;
	
	public StandardKeyboard(){
		this.setKeyboard("Standard"); //Sets type 
	}
	
	@Override
	public void displayInformation() {
		System.out.println("Keyboard Type: " + keyboard); //Returns product tier
	}
	
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard; //Sets string to private variable
	}
	
	@Override
	public int getKCost(){
		return 40; //Arbitrary cost
	}
	
	public String getKeyboard(){
		return this.keyboard; //Returns variable above
	}
}
