package linkedLists;

public class RunLastFirst
{
	
	public static void main(String[] args) {
		
		LastFirst lf = new LastFirst();
		
//		lf.insertFirst(1, 1.1);
//		lf.insertFirst(2, 2.1);
//		lf.insertFirst(3, 3.1);
		
		lf.insertLast(4, 4.1);
		lf.insertLast(5, 5.1);
		lf.insertLast(6, 6.1);
		
		lf.addValueInbetween(4, 7, 7.1);
		lf.display();
	}

}
