package com.Abstract.app;

public abstract class Roadways {
	public void transport()
	{
		System.out.println("invoking transport in Roadways");
	}
	public boolean travel()
	{
		System.out.println("invoking travel in Roadways ");
		return true;
	}
	public boolean connectivity()
	{
		System.out.println("invoking connectivity in Roadways");
		return true;
	}
	public void trade()
	{
		System.out.println("invoking trade in Roadways");
	}
	public boolean tourism()
	{
		System.out.println("invoking tourism in Roadways");
		return true;
	}
	public abstract boolean urbanDevelopement();
	public abstract boolean publicService();
	public abstract boolean economicGrowth();
	public abstract boolean interConnection();
	public abstract boolean safety();

}
