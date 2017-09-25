package allAlgos;

import javax.management.RuntimeErrorException;

public class RunLinkedList 
{
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insertLast(4);
		ll.insertInbetween(2);
		ll.displayValue();
		ll.deleteInbetween(1);
		ll.displayValue();
		ll.deleteInbetween(2);
		ll.deleteInbetween(-5);
		
		ll.deleteInbetween(4);
		
		ll.displayValue();
		ll.deleteInbetween(3);
		System.out.println(ll.size);
	}
}

class LinkedList
{
	
	Link first = null;
	int size =0;
	public void insertFirst(int data)
	{
		Link node = new Link(data);
		node.next = first;
//		first.next = null;
	}
	
	public void insert(int data)
	{
		Link link = new Link(data);
		link.next = first;
		first = link;
		size++;
	}
	
	public void insertInbetween(int key)
	{
		Link current = first;
		Link previous = current;
		while(current.next !=null)
		{
			if(current.value == key)
			{
				Link link = new Link(-5);
				previous.next = link;
				link.next = current;
				break;
			}
			
			previous = current;
			current = current.next;
		}
	}
	
	public int deleteInbetween(int key)
	{
		Link current = first;
		Link previous  = current;
		boolean keyIsPresent = false;
		while(current != null)
		{
			if(current.value == key)
			{
				previous.next = current.next;
				current = current.next;
				keyIsPresent = true;
				size--;
				break;
			}
			previous = current;
			current = current.next;
			
		}
		if(keyIsPresent)
		{
			return key;
		}else
		{
			throw new RuntimeException("Key not found");
		}
		
		
	}
	
	public void displayValue()
	{
		Link current = first;
		while(current != null)
		{
			current.display();
			current = current.next;
		}
		System.out.println("size " + size );
	}
	
	
	public void insertLast(int data)
	{
		Link current = first;
		while(current.next !=null)
		{
			current = current.next;
		}
		
		Link link = new Link(data);
		current.next = link;
		link.next = null;
		size++;
	}
	
}

class Link{
	
	Link next;
	int value;
	public Link(int value)
	{
		this.value = value;
	}
	
	public void display()
	{
		System.out.println("The value is " + value);
	}
}