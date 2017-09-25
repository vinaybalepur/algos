package allAlgos;

public class RunStack 
{

	public static void main(String[] args) {
		Stack s = new Stack(3);
		System.out.println(s.isStackFull());
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.getSize());
		System.out.println(s.isStackFull());
		while(!s.isStacEmpty())
		{
			System.out.println(s.pop());
		}
		
		System.out.println(s.getSize());
		System.out.println(s.isStacEmpty());
	}
}

class Stack{
	
	int end = -1;
	Integer i[];
	int total =0;
	int size;
	
	public Stack(int size)
	{
		this.size = size;
		i = new Integer[size];
	}
	
	public void push(int data)
	{
		if(!isStackFull())
		{
			i[++end] = data;
			total++;
		}else
		{
			throw new RuntimeException("Stack is full. Can't push");
		}
	}
	
	public int pop()
	{
		if(!isStacEmpty())
		{
			total--;
			return i[end--];
		}
		throw new RuntimeException("Statck is empty. Can't pop");
	}
	
	public boolean isStackFull(){
		if(total == size) 
		{
			return true;
		}
		return false;
	}
	
	public boolean isStacEmpty()
	{
		if(end == -1)
		{
			return true;
		}
		return false;
	}
	
	public int getSize()
	{
		return total;
	}
	
}
