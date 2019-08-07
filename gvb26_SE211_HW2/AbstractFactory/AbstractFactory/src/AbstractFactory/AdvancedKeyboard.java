package AbstractFactory;

public class AdvancedKeyboard extends Keyboard {
	private String keyboard;
	
	public AdvancedKeyboard(){
		this.setKeyboard("Advanced"); //Sets to advanced
	}
	
	@Override
	public void displayInformation() {
		System.out.println("Keyboard Type: " + keyboard); //displays product tier
	}
	
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard; //Assigns to private variable
	}
	
	@Override
	public int getKCost(){
		return 75; //Arbitrary Cost
	}
	
	public String getKeyboard(){
		return this.keyboard; //Returns above variable
	}
	
}
