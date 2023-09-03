package factory_design_pattern.creational.impl;


import factory_design_pattern.creational.api.INotification;

public class SMSNotification implements INotification{



	@Override
	public void notifyUser(String name) {
		// TODO Auto-generated method stub
		System.out.print("\n Sent SMS Nofication for User:" + name);
		
	}

}
