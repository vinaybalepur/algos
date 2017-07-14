package linkedLists;

public class RunLinkedList
{
	
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.insert(1, 1.1);
		l.insert(2, 2.2);
		l.insert(3, 3.3);
		l.insert(4, 4.4);
		l.insert(5, 5.5);
		
//		l.display();
//		l.deleteLink(10);
//		l.insertLast(0, 0.1);
		l.insertValueInBetween(6, -1, -1.1);
		l.display();
	}

}
