package factory_design_pattern.creational.factory;

import factory_design_pattern.creational.api.INotification;
import factory_design_pattern.creational.api.NotSupportedNotificationException;
import factory_design_pattern.creational.api.NotificationType;
import factory_design_pattern.creational.impl.EmailNotification;
import factory_design_pattern.creational.impl.PushNotification;
import factory_design_pattern.creational.impl.SMSNotification;

public class NotificationFactory {
	
INotification createNotification(String type) throws Exception{
	
	INotification notification;
	
	
	     if(NotificationType.EMAIL.toString().equals(type))
	     {
	    	 notification = new EmailNotification();
	     }
		
	     else if(NotificationType.SMS.toString().equals(type))
	     {
	    	 notification = new SMSNotification();
	     }
	    		  
	     else if(NotificationType.PUSH.toString().equals(type))  
	     {
	    	 notification = new PushNotification();
	     }
	    	 
		else {
	            throw new NotSupportedNotificationException("Not Supported Notification Type");
		     }
		return notification;
        }

}
