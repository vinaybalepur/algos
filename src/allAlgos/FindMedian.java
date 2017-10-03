package allAlgos;

import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindMedian 
{
	
	public static void main(String[] args) {
		Scanner scan = new  Scanner(new InputStreamReader(System.in));
		PriorityQueue pq = new PriorityQueue<>();
		
		while(true)
		{
			System.out.println("Enter something");
			int s = scan.nextInt();
			pq.add(s);
		}
	}
	
	static void calculatMedian(PriorityQueue pq)
	{
		PriorityQueue temp = pq;
		int size = temp.size();
		if(size == 1)
		{
			System.out.println("Median is " + temp.poll());
		}else if(size % 2 == 0)
		{
			
		}
	}

}
