package  comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** This can be used to sort an array list. To sort it in reverse order based on votes. The logic is anyone with
 * highest number of votes is the winner. If there is  a tie, then the name of the person is compared and sorted
 * in alphabetical order. To sort a list use Comparator interface and implement compare method. This method
 * takes two arguments, obj1 and obj2. If u want to sort data based on some value lets say votes, then, in the 
 * compare method compare the votes. If obj1 votes is greater than obj2, then return -1 else return 1.
 * If there is a tie, then compare the names of the candidate and return the candidate whose name is alphabetically
 * sorted. The advantage of Comparator interface is, we can implement this interface in any class and pass the class
 * object as an argument for sort method. In this example, we are passing compararevotes object to sort method and in
 * comparevotes class implements comaparator interface.
 * 
 * @author vinay
 *
 */
public class UnderstandingComparable
{
	public static void main(String[] args) {
		List<Votes> a = new ArrayList<Votes>();
		a.add(new Votes(30, "Jane"));
		a.add(new Votes(30, "Alex"));
		a.add(new Votes(10, "Xandera"));
		a.add(new Votes(50, "Xanderb"));
		a.add(new Votes(50, "Xanderc"));
		a.add(new Votes(50, "Xanderd"));
		
		
		Collections.sort(a, new CompareVotes());
		
		System.out.println("-------------------");
		for(Votes i :a)
		{
			System.out.println( i.votes + i.name);
		}
		
		
	}
}


class Votes 
{

	int votes;
	String name;
	
	
	
	public Votes(int votes, String name)
	{
		this.votes = votes;
		this.name = name;
	}
	
	
}
