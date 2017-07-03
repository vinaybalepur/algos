package linkedLists;

public class RunLinkedLists 
{
	
	public static void main(String[] args) {
		
		LinkList ll = new LinkList();
		
		for(int i=1;i<10;i++)
		{
			int key =i;
			Double value = (double) new Double(key*2.1).shortValue();
			ll.insert(key, value);
		}
		
		
//		
//		ll.removeFirst();
//		ll.removeFirst();
//		ll.removeFirst();
//		
//		System.out.println(ll.find(5));
//		System.out.println("-------------------");
		
//		Link l = ll.deleteLink(9);
//		Link l1 = ll.deleteLink(4);
//		System.out.println(l.value);
		ll.display();
	}

}
