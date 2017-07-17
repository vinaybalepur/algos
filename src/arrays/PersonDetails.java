package arrays;

public class PersonDetails 
{
	Person[] p;
	int dataset =0;
	
	public PersonDetails(int totalNoOfValuesToStore)
	{
		p = new Person[totalNoOfValuesToStore];
	}
	
	public void addPersonDetails(String first, String last, int age, int id)
	{
		p[dataset] = new Person(first, last, age, id);
		dataset++;
	}
	
	public Person  searchForID(int id)
	{
		int start = 0;
		int end = p.length;
		
		while(true)
		{
			int midpoint = (start + end)/2;
			if(id == midpoint)
			{
				p[id].displayPersonDetails();
				return p[id];
			}
		}
	}
	
	public void displayPersonData()
	{
		for(int i=0;i<dataset;i++)
		{
			p[i].displayPersonDetails();
		}
	}

}
