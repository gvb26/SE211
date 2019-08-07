package weatherAlert;
import java.util.Observable;
import java.util.Observer;
public class EmailService implements Service{//updates email observers
	@Override
	public void update(String message){
		System.out.println("Notification received via email: " + message);
	}



}
