package AlphaMobile;

public class AlphaMobile {
	private AlphaMobileFactory AlphaMobileFactory;
	private Phone _phone;
	private String model;
	
	public AlphaMobile(Phone _phone){
		_phone = AlphaMobileFactory.assemblePhone(model);
	}
	public void displayInfo(){
		_phone.displayInfo();
	}
}
