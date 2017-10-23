package comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author vinay
 * 
 */
public class RunEmployee 
{
	public static void main(String[] args) {
		List<Employee> list = new LinkedList<Employee>();
		list.add(new Employee("c", 10));
		list.add(new Employee("b", 20));
		list.add(new Employee("a", 15));
		list.add(new Employee("d", 15));
		
		
		Collections.sort(list, new CompareOutsideEmployee());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).name + " -- " + list.get(i).age);
		}
	}

}

class Employee
{
	
	public int age;
	public String name;
	
	public Employee(String name, int age)
	{
		this.age =age;
		this.name = name;
	}


	
}

class CompareOutsideEmployee implements Comparator<Employee>
{
	
	// Return values in descending order by name
//	public int compare(Employee o1, Employee o2) {
//		
//		return o2.name.compareTo(o1.name);
//	}
	
	// Returns values in ascending order by name
//	public  int compare(Employee o1, Employee o2)
//	{
//		return o1.name.compareTo(o2.name);
//	}
	
	
	// Returns values based on age in ascending order
//	public int compare(Employee o1, Employee o2)
//	{
//		if(o1.age > o2.age)
//		{
//			return 1;
//		}else if(o1.age<o2.age)
//		{
//			return -1;
//		}else
//		{
//			return 0;
//		}
//	}
	
	// Return values based on age in descending order
//	public int compare(Employee o1, Employee o2)
//	{
//		if(o1.age > o2.age)
//		{
//			return -1;
//		}else if(o1.age<o2.age)
//		{
//			return 1;
//		}else
//		{
//			return 0;
//		}
//	}
	
	// This returns values in ascending order of age. If two employess have the same age,
	// then the names are sorted in ascending order.
	/**
	 * Output is 
	 *  
	    c -- 10
	    a -- 15
		d -- 15
		b -- 20
	 */
	
//	public int compare(Employee o1, Employee o2)
//	{
//		if(o1.age > o2.age)
//		{
//			return 1;
//		}else if(o1.age < o2.age)
//		{
//			return -1;
//		}else
//		{
//			return o1.name.compareTo(o2.name);
//		}
//	}

	public int compare(Employee o1, Employee o2)
	{
		if(o1.age < o2.age)
		{
			return 1;
		}else if(o1.age > o2.age)
		{
			return -1;
		}else
		{
			return o1.name.compareTo(o2.name);
		}
	}
	
}
