package factory_design_pattern.creational.factory;

import factory_design_pattern.creational.api.INotification;
import factory_design_pattern.creational.api.NotSupportedNotificationException;
import factory_design_pattern.creational.api.NotificationType;
import factory_design_pattern.creational.impl.EmailNotification;
import factory_design_pattern.creational.impl.PushNotification;
import factory_design_pattern.creational.impl.SMSNotification;

public class NotificationService {
	
public static void main(String arg [])
{
	NotificationFactory factory = new NotificationFactory();
	INotification notifcation;

	try {
		notifcation = factory.createNotification("EMAIL");
	    notifcation.notifyUser("USER1");
	
	
	INotification notifcation2 = factory.createNotification("SMS");
	notifcation2.notifyUser("USER2");
	
	INotification notifcation3 = factory.createNotification("Invalid");
	notifcation3.notifyUser("USER3");
	} catch (Exception e) {
		// TODO Auto-generated catch block
	 System.out.println("\nUnable to create notification:");
	 e.printStackTrace();
	}
}
     
}
