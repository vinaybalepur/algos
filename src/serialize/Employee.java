package serialize;

import java.io.Serializable;

public class Employee implements Serializable
{
	/**
	 
	 */
	private String name; 
	private int age;
	
	
	public Employee(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public static void getMessage()
	{
		System.out.println("Getting message");
	}
	
	private void test() {
		System.out.println( "Inside test");
	}
	
	void test1()
	{
		System.out.println( "Inside test1");
	}

}
