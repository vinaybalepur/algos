package allAlgos;

import java.util.Stack;

public class StackReverse 
{
	static Stack s;
	public static void main(String[] args) {
		s = new Stack<>();
		s.push("a");
		s.push("b");
		s.push("c");
		reverseStack(s);
		
	}
	
	static void reverseStack(Stack s)
	{
		if(s.isEmpty()) {return;}
		
		String temp = (String) s.pop();
		reverseStack(s);
		addToBottom(s, temp);
	}
	
	static void addToBottom(Stack s, String data)
	{
		if(s.isEmpty())
		{
			s.push(data);
			return;
		}
		String st = (String) s.pop();
		addToBottom(s, data);
		s.push(st);
	}
	

}
