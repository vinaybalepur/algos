package allAlgos;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveCharectersCount 
{
	
	public static void main(String[] args) {
		String str = "aaabbddaabbcc";
		List<String> list = new ArrayList<String>();
		int counter =1;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i) == str.charAt(i+1))
			{
				++counter;
			}else
			{
				list.add(counter+ "" + str.charAt(i));
				counter =1;
			}
		}
		
		System.out.println(list.toString());
	}

}
