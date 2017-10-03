package allAlgos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ClimbingLeaderBoard 
{

	public static void main(String[] args) {
		int ar[] = {10,20,40,40,50,100,100};
		int score = 5;
//		int rank = getPosition(ar, score);
//		System.out.println(rank);
		
	}
	static void getPosition(int[] ar, int score)
	{
		int n = 4;
		int[] positions = new int[n];
		Set<Integer> set = new HashSet<Integer>();
		for(int i =0;i<ar.length-1;i++)
		{
			set.add(ar[i]);
		}
		int rank = set.size();
		Object[] a = set.toArray();
		Arrays.sort(a);
		for(int j = 0;j<n;j++)
		{
			for(int i=0;i<a.length-1;i++)
			{
				if(score <(int) a[i] && i ==0)
				{
					rank = rank+1;
					positions[j] = rank;
					break;
				}
				
				if(score>(int) a[i])
				{
					rank = rank-1;
				}else
				{
					break;
				}
			}
			positions[j] = rank;
		}
		
		System.out.println(Arrays.toString(positions));
			
	}
}
