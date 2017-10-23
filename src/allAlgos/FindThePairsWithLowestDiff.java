package allAlgos;

import java.util.ArrayList;
import java.util.Arrays;

public class FindThePairsWithLowestDiff 
{
	
	public static void main(String[] args) {
		
		
		int i[] = {-20,-3916237,-357920,-3620601,7374819,-7330761,30,6246457,-6461594,266854,-520,-470};
		Arrays.sort(i);
		System.out.println(i.length);
		ArrayList<Integer> a = new ArrayList<>();
		int minDiff =Math.abs(i[0]-i[1]);
		
		
		for(int j=0;j<i.length-1;j++)
		{
			int diff = Math.abs(i[j]-i[j+1]);
			if(diff<minDiff)
			{
				minDiff = diff;
				a.clear();
				a.add(i[j]);
				a.add(i[j+1]);
			}else if(diff==minDiff)
			{
				a.add(i[j]);
				a.add(i[j+1]);
			}
		}
		
		System.out.println(a);
	}

}
