package AlphaMobile;

public class SingaporeFactory implements AlphaMobileFactory {
	private static Phone product;
	@Override
	public Phone assemblePhone(String phone){
		if (phone.equals("Smart 4")){
			product = new Smart4();
		}
		else if (phone.equals("Smart 5")){
			product = new Smart5();
		}
		else{
			System.out.println("Invalid entry");
		}
		return product;
	}
}
