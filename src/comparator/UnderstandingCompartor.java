package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnderstandingCompartor 
{
	
	public static void main(String[] args) {
		List<Employee2> e = new ArrayList<Employee2>();
		e.add(new Employee2(20, "twenty"));
		e.add(new Employee2(10, "ten"));
		e.add(new Employee2(30, "Thirty"));
		e.add(new Employee2(50, "fivty"));
		e.add(new Employee2(60, "sixty"));
		
		
		Collections.sort(e);
		for (Employee2 i : e)
		{
			System.out.println(i.name);
		}
		
		
	}
}


class Employee2 implements Comparable<Object>
{
	int age;
	String name;
	
	
	public Employee2(int age, String name)
	{
		this.age = age;
		this.name = name;
	}

	
	public int compareTo(Object o) {
		int ageToCompare =  ((Employee2) o).age; 
		return this.age-ageToCompare;
//		return ageToCompare-this.age;
	}

	
}