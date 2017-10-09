package linkedLists;

/**
 * This class creates the link list which houses the values added to the linked list and also the details of the link
 * link. Initially we set the first link as null. This means the linked list is  empty.
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
	
	/* Every time  a new value is inserted into the linked list a new  link (Link) is created. Remember
	 * initially the first link was empty(null). When the new value is added then the link will have this new
	 * value and the null value should be moved to the link link.*/
	
	public void insert(int key, double value)
	{
		Link newLink = new Link(key, value);
		newLink.next = first;
		first = newLink;
	}
	
	/* In this method we remove the first link object and move the pointer to the link link object.
	 * We can remove from the starting element only and not in between. 
	 * Since we are removing the link object my new first will be the second link object.
	 * If we remove the second link object also then my new first will be third link object and so on.*/
	public Link removeFirst()
	{
		Link temp = first;
		first = first.next;
		return  temp;
		
	}
	
	@SuppressWarnings("null")
	public double find(int  key)
	{
		Link current = first;
		while(current != null)
		{
			if(current.key == key)
			{
				System.out.println("Value of key is " + current.value);
				return current.value;
				
			}
			current = current.next;
		}
		return (Double) null;
	}
	
	public Link deleteLink(int key)
	{
		Link currentLink = first;
	    Link previousLink = first;
	    
	    while(currentLink.key != key)
	    {
	      if(currentLink.next == null)
	      {
	        return null;
	      }else 
	      {
	        previousLink = currentLink;
	        currentLink = currentLink.next;
	      }
	      
	    }
	    
	    if(currentLink == first)
	    {
	      first  = first.next;
	      
	    }else
	    {
	      previousLink.next = currentLink.next;
	      System.out.println(previousLink.key);
	      System.out.println(currentLink.key);
	    }
		
		return currentLink;
	}
	
	public boolean isEmpty()
	{
		return (first==null);
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
	
	/** This takes a link list as an argument and converts the list to a circular link list
	 * by pointing the last node to the first node*/
	public TestLinkList createCircularLinkList(TestLinkList ll)
	{
		TestLink current = ll.first;
		while(current.next !=null)
		{
			current = current.next;
		}
		current.next = ll.first;
		return ll;
	}
	
	/** This takes circular link list as an argument and breaks the circle at the last node.
	 * There are two pointers head and tail. Both point to the first node. The tail pointer
	 * does not move and head pointer moves starting from head node. Once the head reaches tail,
	 * then then head element points to null and returns the linkedlist object.
	 * @param ll
	 * @return
	 */
	public TestLinkList breakCircularLinkList(TestLinkList ll)
	{
		
		TestLink head = ll.first;
		TestLink tail = head;
		while(head.next != tail)
		{
			head = head.next;
		}
		head.next = null;
		
		return ll;
	}
	
	

}
