package linkedLists;

/**
 * This class creates the link list which houses the values added to the linked list and also the details of the next
 * container. Initially we set the first container as null. This means the linked list is  empty.
 * @author vinay
 *
 */
public class LinkList 
{
	
	Link first;
	
	public LinkList()
	{
		first = null;
	}
	
	/* Every time  a new value is inserted into the linked list a new  container (Link) is created. Remember
	 * initially the first container was empty(null). When the new value is added then the container will have this new
	 * value and the null value should be moved to the next container.*/
	
	public void insert(int i)
	{
		Link newLink = new Link(i);
		newLink.next = first;
		first = newLink;
	}
	
	public boolean isEmpty()
	{
		return (first == null);
	}
	
	public void display()
	{
		Link current = first;
		while(current != null)
		{
			current.displayValueInLinkContainer();
			current = current.next;
		}
		
	}

}
