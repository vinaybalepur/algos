package linkedLists;

public class RunLinkedLists 
{
	
	public static void main(String[] args) {
		
		LinkList ll = new LinkList();
		
		for(int i=0;i<10;i++)
		{
			ll.insert(i);
		}
		
		ll.display();
	}

}
