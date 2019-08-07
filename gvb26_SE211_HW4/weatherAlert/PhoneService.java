package weatherAlert;
import java.util.Observable;
public class PhoneService implements Service {
	@Override
	public void update(String message){//Updates phone observers
		System.out.println("Notification received via phone: " + message);
	}
}
