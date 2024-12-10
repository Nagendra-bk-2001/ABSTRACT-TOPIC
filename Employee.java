package com.abstaract;

public class Employee extends Person {
	@Override
	void work()
	{
		System.out.println("Working in IT companys");
	}
	
	public static void main(String[] args)
	{
		Employee e = new Employee();
		e.work();
	}

}
