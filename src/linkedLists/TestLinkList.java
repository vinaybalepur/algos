package linkedLists;

import threads.Test;

public class TestLinkList 
{
	
	TestLink first = null;
	
	public TestLinkList()
	{
		first = null;
	}
	
	public void insertValue(int i)
	{
		TestLink link = new TestLink(i);
		
		link.next = first;
		
		first = link;
		
	}

	
	public TestLink  deleteLink(int i)
	{
		TestLink current = first;
		
		TestLink previous = first;
		while(current.value != i)
		{
			if(current.next != null)
			{
				previous = current;
				current = current.next;
			}else
			{
				return null;
			}
		}
		
		if(current == first)
		{
			current = current.next;
		}else {
			previous.next = current.next;
		}
		return current;
	}
	
	public void insterInbetween(int val, int newvalue)
	{
		TestLink current = first;
		TestLink previous = current;
		
		while(current.next != null)
		{
			if(current.next == null)
			{
				throw new RuntimeException();
			}
//			System.out.println(current.value);
			if(current.value == val)
			{
				TestLink link = new TestLink(newvalue);
				previous.next = link;
				link.next = current;
				break;
			}else
			{
				previous = current;
				current = current.next;
			}
			
			
		}
	}
	
	public void instertLast(int i)
	{
		TestLink current = first;
		TestLink link  = new TestLink(i);
		while(current.next != null)
		{
			current = current.next;
		}
		current.next = link;
		current.next.next = null;
		
		
	}
	
	public boolean isEmpty()
	{
		 
		if(first == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void display()
	{
		TestLink current = first;
		while(current != null)
		{
//			System.out.println(current.hashCode());
			current.display();
			current = current.next;
		}
		
	}
	
	public TestLinkList revereseLinkedList(TestLinkList ll)
	{
		TestLink previous = null;
		TestLink current = ll.first;
		TestLink next = null;
		
		while(current!=null)
		{
			
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			
		}
		ll.first = previous;
		return ll;
	}
	
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
