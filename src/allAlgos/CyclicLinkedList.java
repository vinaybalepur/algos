package allAlgos;

import java.util.Iterator;
import java.util.LinkedList;

public class CyclicLinkedList implements Comparable<Integer>
{
	int x;
	public static void main(String[] args) {
		CyclicLinkedList c = new CyclicLinkedList();
		System.out.println(c.compareTo(1252169911));
	}

	@Override
	public int compareTo(Integer o) {
		x =  589431969;
		return(o.compareTo(x));
	}

}
