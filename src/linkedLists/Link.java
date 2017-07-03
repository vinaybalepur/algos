package linkedLists;

/**
 * In linked list the values are stored in containers which here is called as Link. Every container should 
 * either point to null which is the end or should point to the next container. Initially the next container(link)
 * is null. Every time a new value is inserted the null container is moved up the chain. Here the value is always
 * added from the first container onwards.
 * @author vinay
 *
 */
public class Link 
{

	/** This is the value that will be stored inside the container.
	 * There should be a reference back to the same class. This is called as self reference
	 */
	
	int key;
	double value;
	public Link next;
	
	/** Here will initialize next as null and also insert the value in the current container */
	public Link(int key, double value)
	{
		this.key = key;
		this.value = value;
		next = null;
	}
	
	
	
	public void displayValueInLinkContainer()
	{
		
		System.out.println("The key is " + key +" . The value is " + value);
		
	}
}
