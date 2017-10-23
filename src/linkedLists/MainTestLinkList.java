package linkedLists;

public class MainTestLinkList
{
	
	public static void main(String[] args) {
		TestLinkList ll = new TestLinkList();
		ll.insertValue(1);
		ll.insertValue(2);
		ll.insertValue(3);
		ll.insertValue(4);
//		ll.display();
//		ll.revereseLinkedList(ll).display();
		TestLinkList circular = ll.createCircularLinkList(ll);
		ll.breakCircularLinkList(ll);
		circular.display();
		
	}

}
