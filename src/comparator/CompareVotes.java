package comparator;

import java.util.Comparator;

public class CompareVotes implements Comparator<Votes>
{
	
	public CompareVotes() {
		System.out.println("Comparing");
	}
	
	@Override
	public int compare(Votes o1, Votes o2) {
		if(o1.votes == o2.votes)
		{
			return o1.name.compareTo(o2.name);
		}
		else if(o1.votes>o2.votes)
		{
			return -1;
		}else
		{
			return 1;
		}
	}

}