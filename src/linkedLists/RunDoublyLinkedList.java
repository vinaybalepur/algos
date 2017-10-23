package linkedLists;

public class RunDoublyLinkedList {

	public static void main(String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.insertAtBeginning(1);
		dll.insertAtBeginning(2);
		dll.insertAtBeginning(4);
//		dll.printData();
		dll.insertAtEnd(-1);
		dll.insertAtEnd(-2);
		dll.insertAtEnd(-3);
		dll.printData();
		System.out.println(dll.getSize());
		System.out.println("--------------");
		dll.removeFromFront();
		dll.printData();
		System.out.println(dll.getSize());
		System.out.println("-------------");
		dll.removeFromRear();
		dll.removeFromRear();
		dll.printData();
		
	}
}


class DoubleLinkedList
{
	
	private DoubleLink first = null;
	private int size=0;
	
	public void insertAtBeginning(int value)
	{
		if(first == null)
		{
			first = new DoubleLink(null, value, null);
			
		}else
		{
			DoubleLink dl = new DoubleLink(null, value, first);
			first.previous = dl;
			first = dl;
		}
		size++;
	}
	
	public void insertAtEnd(int value)
	{
		if(first == null)
		{
			first = new DoubleLink(null, value, null);
		}else
		{
			DoubleLink current = first;
			while(current.next !=null)
			{
				current = current.next;
			}
			
			DoubleLink dl = new DoubleLink(current, value, null);
			current.next = dl;
		}
		size++;
	}
	
	public void printData()
	{
		DoubleLink current = first;
		while(current != null)
		{
			current.display();
			current = current.next;
		}
	}
	
	public void removeFromFront()
	{
		if(first==null) 
		{
			return;
		}else
		{
			first = first.next;
			first.previous = null;
		}
		size--;
		
	}
	
	public void removeFromRear()
	{
		if(first==null)
		{
			return;
		}else
		{
			DoubleLink current = first;
			while(current.next.next !=null)
			{
				current = current.next;
			}
			
			current.next = null;
			size--;
		}
	}
	public int getSize()
	{
		return size;
	}
	
}


class DoubleLink
{
	DoubleLink next;
	DoubleLink previous;
	int value;
	
	public DoubleLink(DoubleLink previous, int value, DoubleLink next) 
	{
		this.previous = previous;
		this.value = value;
		this.next = next;
	}
	
	public void display()
	{
		System.out.println(value);
	}
}
