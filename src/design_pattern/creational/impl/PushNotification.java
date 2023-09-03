package factory_design_pattern.creational.impl;


import factory_design_pattern.creational.api.INotification;

public class PushNotification implements INotification{


	@Override
	public void notifyUser(String name) {
		// TODO Auto-generated method stub
		System.out.print("\n Sent Push Nofication for User:" + name);
	}

}
