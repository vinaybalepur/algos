package linkedLists;

public class TestLink 
{
	
	TestLink next;
	int value;
	
	public TestLink(int value)
	{
		this.value = value;
		next = null;
	}
	
	public void display()
	{
		System.out.println(value);
	}

}
