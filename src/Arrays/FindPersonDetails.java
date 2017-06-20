package Arrays;

public class FindPersonDetails 
{
	
	public static void main(String[] args) {
		PersonDetails pd = new PersonDetails(2);
		pd.addPersonDetails("a", "b", 10, 0);
		pd.addPersonDetails("c", "d", 11, 1);
		
		pd.displayPersonData();
		
		Person p = pd.searchForID(1);
		p.displayPersonDetails();
	}

}
