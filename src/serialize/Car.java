package serialize;

import java.io.Serializable;

public class Car implements Serializable
{
	
	
	/**
	 * 
	 */
	
	int wheels;
	String name;
	int wheelBase;
	
	public Car(int wheels, String name)
	{
		this.wheels = wheels;
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
}
