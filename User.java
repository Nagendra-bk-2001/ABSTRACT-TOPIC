package com.abstaract;

public class User extends Car {
	
	@Override
	void start()
	{
		System.out.println("My Car is started");
	}
	
	@Override
	void stop()
	{
		System.out.println("My Car is stoped");
	}
	
	public static void main(String[] args)
	{
		User u = new User();
		u.start();
		u.stop();	
		u.shiftGears();
	}
}
