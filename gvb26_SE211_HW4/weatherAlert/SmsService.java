package weatherAlert;
import java.util.Observable;
import java.util.Observer;
public class SmsService implements Service{//Updates sms observers
	@Override
	public void update(String message){
		System.out.println("Notification received via SMS: " + message);
	}
}
