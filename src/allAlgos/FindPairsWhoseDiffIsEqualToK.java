package allAlgos;

import java.util.Arrays;

public class FindPairsWhoseDiffIsEqualToK {

	public static void main(String[] args) {
		int i[] = {1,4,5,3,2};
		System.out.println(pairs(i, 2));
	}
	
	static int pairs(int[] a,int k) {
	      Arrays.sort(a);
	      int left = 0;
	      int right = 0;
	      int counter =0;  
	        while(right<a.length)
	        {
	            if(a[right]-a[left] == k)
	            {
	            	System.out.println("(" + a[right] + "," +a[left] + ")");
	                counter++;
	                right++;
	                left++;
	            }else if(a[right] -a[left]<k)
	            {
	                right++;
	            }else
	            {
	                left++;
	            }
	        }
	        return counter;
	}
}
