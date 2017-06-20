package Stack;

public class ReverseString
{
	public static void main(String[] args) 
	{
		String s = "Mom";
		
		
		StackOfArray sa = new StackOfArray(s.length());
		
		for(int i =0;i<s.length();i++)
		{
			sa.push(s.charAt(i));
		}
		
		String newWord = "";
		while(!(sa.isStackEmpty()))
		{
			char c1 = (char) sa.pop();
			newWord = newWord+ c1;
			
		}
		
		System.out.println(newWord);
		
	}

}
