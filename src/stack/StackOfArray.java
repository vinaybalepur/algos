package stack;

public class StackOfArray 
{
	
	private char stackArray[];
	private int pointer = -1;
	private int stackSize=0;
	
	public StackOfArray(int stackSize)
	{
		this.stackSize = stackSize;
		stackArray = new char[stackSize];
	}
	
	public void push(char pushValue)
	{
		if(pointer>stackSize)
		{
			System.out.println("Run out of stack");
		}else
		{
			pointer = pointer +1;
			stackArray[pointer] = pushValue;
		}
	}

	public char pop()
	{
		char val = 0;
		if(pointer < 0)
		{
			System.out.println("Noting to pop out");
		}else
		{	
			val =  stackArray[pointer];
			pointer = pointer -1;
			
		}
		return val;
	}
	
	public long peek()
	{
		return stackArray[pointer];
	}
	
	public boolean isStackFull()
	{
		boolean stackFull = false;
		if(pointer == stackSize-1)
		{
			stackFull = true;
		}
		return stackFull;
		
	}
	
	public boolean isStackEmpty()
	{
		boolean stackEmpty = false;
		if(pointer <0) {
			stackEmpty = true;
		}
		return stackEmpty;
	}
}
