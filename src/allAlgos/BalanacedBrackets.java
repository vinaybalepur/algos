package allAlgos;

import java.util.Stack;

public class BalanacedBrackets 
{
	/**
	 * Two conditions mandatory to be handled
	 * If the stack is empty and we are trying to pop a value.
	 * If comparison is completed and still there is a value left in the stack and the stack is not empty
	 * @param args
	 */
	
	public static void main(String[] args) 
	{
		// Stack size==0 check data = {})
		// Stack size >1 check data = ({}
		// Correct data = [{()}]
		String s = "({})";
		char c[] = s.toCharArray();
		
		boolean error = false;
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<c.length;i++)
		{
			if(c[i] == '{' || c[i] == '(' || c[i] == '[')
			{
				stack.push(c[i]);
			}else if(c[i] == '}' || c[i] == ')' || c[i] == ']')
			{
				/** This condition is to identify if we are trying to pop an empty stack. If stack is empty, then we get empty stack exception
				 * Since we are trying to match a closing bracket with an empty opening bracket, this exception will be thrown and needs to 
				 * be handled.  
				 */
				if(stack.isEmpty()) {
					error = true;
					break;
				}
				char popped = (char) stack.pop();
				if(popped == '(')
				{
					if(!(popped == '(' && c[i] == ')'))
					{
						error = true;
						break;
					}
				}else if(popped == '[') {
					if(!(popped == '[' && c[i] == ']'))
					{
						error = true;
						break;
					}
				}else if(popped == '{') {
					if(!(popped == '{' && c[i] == '}'))
					{
						error = true;
						break;
					}
				}
			}
		}
		/** This is to handle any mismatch at the last character. If there is any mismatch in the final character then stack 
		 * will not be empty and continue carrying an unused character and this will fail.
		 */
		if(!(stack.isEmpty()))
		{
			
			error = true;
		}
		
		if(error)
		{
			System.out.println("Not all brackets match");
		}else {
			System.out.println("All ok");
		}
		
		
	}

}
