package recurssion;

import java.util.Arrays;

public class AnagramWithoutRecursion
{
	
	public static void main(String[] args) {
		
		String s = "cat";
		createAnagram(s);
	}
	
	static void createAnagram(String string)
	{
		String str[] = {"1","2","3"};
		String s = Arrays.toString(str);
		String n = null ;
		do {
			for(int i=0;i<str.length-1;i++)
			{ 
				String temp = str[i+1];
				str[i+1] = str[i];
				str[i] = temp;
				System.out.println(Arrays.toString(str));
				n = Arrays.toString(str);
			}
			
		}while(!n.equals(s));
	}

}
