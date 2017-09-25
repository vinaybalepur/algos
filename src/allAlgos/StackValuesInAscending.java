package allAlgos;

import java.util.Stack;

public class StackValuesInAscending 
{
	
	public static void main(String[] args) {
		Stack s = new Stack<>();
		s.push(1);
		s.push(0);
		s.push(3);
		s.push(-5);
		s.push(10);
		Stack r = new Stack<>();
		while(!s.isEmpty())
		{
			int temp = (int) s.pop();
			while(!r.isEmpty() && (int)r.peek()<temp)
			{
				s.push(r.pop());
			}
			r.push(temp);
		}
		
		while(!r.isEmpty())
		{
			System.out.println(r.pop());
		}
	}

}
