package arrays;

public class Person 
{
	
	private String firstName;
	private String lastName;
	private int age;
	private int id;
	
	public Person(String first, String last, int age, int id)
	{
		this.firstName = first;
		this.lastName = last;
		this.age = age;
		this.id = id;
	}

	public void displayPersonDetails()
	{
		System.out.print(" First name -- " + firstName);
		System.out.print(" Last name -- " + lastName);
		System.out.println(" age -- " + age);
	}
	
	public int getID()
	{
		return id;
	}
}
