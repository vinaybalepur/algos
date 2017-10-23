package allAlgos;

import java.util.ArrayList;
import java.util.List;

public class FindAllCombinationsInArray {

	public static void main(String[] args) {
		int i[] = {3,3,9,9,5};
		System.out.println(getCombinations(i));
	}

	static int getCombinations(int i[])
	{
		int totalPosCombinations = (int) (Math.pow(2, i.length) -2);
		
		int maxSum = Integer.MIN_VALUE;
		for(int j=totalPosCombinations;j>0;j--)
		{
			String bit = getBitNumber(j, i.length);
			int max = getMaxSumCombo(i, bit);
			if(max>maxSum)
			{
				maxSum = max;
			}
		}
		return maxSum;
	}
	
	static int getMaxSumCombo(int in[], String bit)
	{
		List<Integer> list = new  ArrayList<Integer>();
		
		int moduloSum = 0;
		for(int i=0;i<bit.length();i++)
		{
			if(bit.charAt(i) == '1')
			{
				list.add(in[i]);
			}
		}
		
		int sum = 0;
		for(int i=0;i<list.size();i++)
		{
			sum = sum + list.get(i);
		}
		
		moduloSum = sum%7;
		
		return moduloSum;
		
	}
	static String getBitNumber(int n, int arrayLen)
	{
		String str = "";
		while(n>=1)
		{
			int x = n %2;
			str = x + str;
			n = n/2;
		}
		
		while(str.length()<arrayLen)
		{
			str = "0" + str;
		}
		return str;
	}
	
	
}



