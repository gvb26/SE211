package AlphaMobile;

public class NewYorkFactory implements AlphaMobileFactory {
	private static Phone product;
	@Override
	public Phone assemblePhone(String phone){
		if (phone.equals("Smart 5")){
			product = new Smart5();
		}
		else if (phone.equals("Smart 6")){
			product = new Smart6();
		}
		else{
			System.out.println("Invalid entry");
		}
		return product;
	}
}
