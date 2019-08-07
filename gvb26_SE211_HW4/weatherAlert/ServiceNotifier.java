package weatherAlert;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ServiceNotifier extends Observable{ //Facilitates the notification process
	private static List<Service> _services;
	
	public ServiceNotifier(){
		this._services = new ArrayList<>();
	}
	public void attach(Service pService){ //Attaches a notification service
		if (!_services.contains(pService)){
			_services.add(pService);
		}
	}
	public void notify(String message){ //Notifies all services
		List<Service> serviceLocal = null;
		serviceLocal = new ArrayList<>(this._services);
		for(Service pService : serviceLocal){
			//for(int i = 0; i < _services.size(); i++){
			pService.update(message);
		}
		
	}
	public void detach(Service pService){ //Detaches a notification service
		
		_services.remove(pService);
	}
	
	public static void main(String[] args){//Driver function
		ServiceNotifier notification = new ServiceNotifier();
		
		PhoneService phone = new PhoneService();
		EmailService email = new EmailService();
		SmsService sms = new SmsService();
		
		notification.attach(phone);
		notification.attach(email);
		notification.attach(sms);
		

		
		notification.notify("Due to inclement weather, all classes are cancelled today");
	}
}
