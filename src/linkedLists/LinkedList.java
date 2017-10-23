package linkedLists;

public class LinkedList 
{
	Link first;
	public LinkedList()
	{
		first = null;
		
	}
	
	public void insert(int key, double value)
	{
		Link newlink = new Link(key, value);
		newlink.next = first;
		first = newlink;
	}
	
	public void getValue(int key)
	{
		Link current = first;
		while(current != null)
		{
			if(current.key == key)
			{
				System.out.println("Found key");
			}
			current = current.next;
		   
		}
	}
	
	public void deleteLink(int key)
	{
		Link current = first;
		Link previous = first;
		
		while(current.key != key)
		{
			if(current.next == null)
			{
				throw new RuntimeException("Reached end of list");
			}else {
				previous = current;
				current = current.next;
			}
		}
		
		if(current == first)
		{
			first = first.next;
		}
		
		previous.next = current.next;
	}
	
	public void insertLast(int key, double value)
	{
		Link current = first;
		Link link = new Link(key, value);
		while(current.next != null)
		{
			current = current.next;
		}
		
		current.next = link;
		link.next = null;
	}
	
	public void insertValueInBetween(int keyToFind, int key, double value)
	{
		Link current = first;
		Link previous = first;
		while(current.next != null)
		{
			if(current.next == null)
			{
				throw new RuntimeException("Reached the end. Could not fine key");
			}
			
			if(current.key == keyToFind)
			{
				Link link = new Link(key, value);
				if(current == first)
				{
					current = current.next;
					previous.next = link;
					link.next = current;
				}else
				{
					previous.next = link;
					link.next = current;
					break;
				}
			}else
			{
				previous = current;
				current = current.next;
			}
			
			
		}
	}
	
	public boolean isEmpty()
	{
		if(first == null)
			return true;
		return false;
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
