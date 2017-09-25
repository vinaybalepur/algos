package allAlgos;

import java.util.Stack;

public class PostFixValidation 
{
	
	public static void main(String[] args) {
		String str = "123*+5-";
		Stack s = new Stack();
		for(int i=0;i<str.length();i++)
		{
			String data = str.substring(i,i+1);
			if(data.equals("*") || data.equals("+") || data.equals("-") || data.equals("/"))
			{
				if(data.equals("*"))
				{
					String s1 = (String) s.pop();
					String s2 = (String) s.pop();
					Integer s3 = Integer.valueOf(s1) * Integer.valueOf(s2);
					s.push(String.valueOf(s3));
				}else if(data.equals("+"))
				{
					String s1 = (String) s.pop();
					String s2 = (String) s.pop();
					Integer s3 = Integer.valueOf(s1) + Integer.valueOf(s2);
					s.push(String.valueOf(s3));
				}else if(data.equals("-"))
				{
					String s1 = (String) s.pop();
					String s2 = (String) s.pop();
					Integer s3 = Integer.valueOf(s2) - Integer.valueOf(s1);
					s.push(String.valueOf(s3));
				}else if(data.equals("/"))
				{
					String s1 = (String) s.pop();
					String s2 = (String) s.pop();
					Integer s3 = Integer.valueOf(s2) / Integer.valueOf(s1);
					s.push(String.valueOf(s3));
				}
			}else
			{
				s.push(data);
			}
		}
		System.out.println(s.pop());
		
	}	

}
