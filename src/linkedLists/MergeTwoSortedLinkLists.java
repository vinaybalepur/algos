package linkedLists;

public class MergeTwoSortedLinkLists 
{
	
	public static void main(String[] args) {
		TestLinkList ll = new TestLinkList();
		ll.insertValue(1);
		ll.insertValue(3);
		ll.insertValue(5);
		
	
		
		TestLinkList ll2 = new TestLinkList();
		ll2.insertValue(2);
		ll2.insertValue(4);
		ll2.insertValue(6);
		ll2.insertValue(7);
		
		
		
		TestLink mergedLists = mergeTwoLinkedLists(ll.first, ll2.first);
		while(mergedLists != null)
		{
			System.out.println(mergedLists.value);
			mergedLists = mergedLists.next;
		}
	}
	
	static TestLink mergeTwoLinkedLists(TestLink node1, TestLink node2)
	{
		TestLink head;
		
		if(node1.value > node2.value)
		{
			head = node1;
			node1 = node1.next;
		}else
		{
			head = node2;
			node2 = node2.next;
		}
		
		TestLink current = head;
		
		while(node1 != null || node2 != null)
		{
			if(node1 == null)
			{
				current.next = node2;
				return head;
			}
			
			if(node2 == null)
			{
				current.next = node1;
				return head;
			}
			
			if(node1.value<node2.value)
			{
				current.next = node2;
				node2  = node2.next;
				current = current.next;
			}else
			{
				current.next = node1;
				node1 = node1.next;
				current = current.next;
			}
		}
		
//		current.next = null;
//		while(head != null)
//		{
//			System.out.println(head.value);
//			head = head.next;
//		}
		return head;
	}
	
	

}
