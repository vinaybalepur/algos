package allAlgos;
import java.util.Arrays;
import java.util.HashSet;

public class MatchPairOfSocks 
{
	
	
	public static void main(String[] args) {
		int i[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		int matchedPair = sockMerchant(i.length, i);
		System.out.println( matchedPair);
		
	}
	
	
	 static int sockMerchant(int n, int[] ar) {
	       HashSet<Integer> hs = new HashSet<Integer>();
	       int totalPairs = 0;
	       for(int i=0;i<ar.length;i++)
	       {
	    	   if(!hs.contains(ar[i]))
	    	   {
	    		   hs.add(ar[i]);
	    	   }else
	    	   {
	    		   hs.remove(ar[i]);
	    		   ++totalPairs;
	    	   }
	       }
	       
	       return totalPairs;
	    }

}
