package linkedLists;

public class LastFirst 
{
	
	Link first;
	Link last;
	
	public LastFirst()
	{
		first = null;
		last = null;
	}
	
	/* Every time  a new value is inserted into the linked list a new  link (Link) is created. Remember
	 * initially the first link was empty(null). When the new value is added then the link will have this new
	 * value and the null value should be moved to the link link.*/
	
	public void insertFirst(int key, double value)
	{
		Link newLink = new Link(key, value);
		newLink.next = first;
		first = newLink;
	}
	
	public void insertLast(int key, double value)
	{
		Link newLink = new  Link(key,value);
		Link current = first;
		if(first == null)
		{
			first = newLink;
		}else
		{
			while(current.next !=null)
			{
				current = current.next;
			}
			current.next = newLink;
			newLink.next = null;
		}
		
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
		return first==null;
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
	
	public void addValueInbetween(int existingKey, int newKey, double newValue)
	{
		Link current = first;
		Link previous = null;
		while(current.next != null)
		{
			if(current.key == existingKey)
			{
				Link newLink = new  Link(newKey, newValue);
				previous.next = newLink;
				newLink.next = current;
			}
			previous = current;
			current = current.next;
			
		}
	}

}
