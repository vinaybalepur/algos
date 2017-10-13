package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnderstandingCompartor 
{
	
	public static void main(String[] args) {
		List<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(20, "twenty"));
		e.add(new Employee(10, "ten"));
		e.add(new Employee(30, "Thirty"));
		e.add(new Employee(50, "fivty"));
		e.add(new Employee(60, "sixty"));
		
		
		Collections.sort(e);
		for (Employee i : e)
		{
			System.out.println(i.name);
		}
		
		
	}
}


class Employee implements Comparable<Object>
{
	int age;
	String name;
	
	
	public Employee(int age, String name)
	{
		this.age = age;
		this.name = name;
	}

	
	public int compareTo(Object o) {
		int ageToCompare =  ((Employee) o).age; 
		return this.age-ageToCompare;
//		return ageToCompare-this.age;
	}

	
}