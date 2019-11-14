package com.rushikeshk.software;

public abstract class engineer {
	//state
	public final int id;
	
	public engineer(int id) {
		this.id=id;
	}
	
	
	//behaviour
	public abstract void design();
	
	//this is abstract method
	
	public void develope()
	{
		System.out.println("Devlope Softwares...");
	}
	
	public void test()
	{
		System.out.println("Test Softwares...");
	}
	
	public boolean equals(Object obj) {
		engineer a = (engineer)obj;
		return a.id == this.id;
	}
}
