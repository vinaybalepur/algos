
package allAlgos;
import java.util.Arrays;
import java.util.EmptyStackException;



public class RunTwoStacksInAnArray
{
	public static void main(String[] args) {
		TwoStackInOneArray t = new TwoStackInOneArray(4);
		t.push(1, 1);
		t.push(1, 2);
		t.push(2, 3);
		t.push(2, 4);
		t.push(2, 5);
		System.out.println(t.getArray());
	}
}

class TwoStackInOneArray 
{
	
	private Integer i[];
	private int leftStart;
	private int rightStart;
	private int size;
	
	public TwoStackInOneArray(int size)
	{
		if(size < 2) {throw new RuntimeException("Size should be minimum 2");};
		this.size = size;
		i = new Integer[size];
		leftStart = -1;
		rightStart =size;
	}
	
	public void push(int stackId, int data)
	{
		if(leftStart+1==rightStart)
		{
			throw new RuntimeException("Array is full. Can't push");
		}
		
		if(stackId == 1)
		{
			i[++leftStart] = data;
		}else if(stackId == 2)
		{
			i[--rightStart] = data;
		}else
		{
			return;
		}
	}
	
	public int pop(int stackId)
	{
		if(stackId == 1) {
			if(leftStart == -1)
			{
				throw new EmptyStackException();
			}else
			{
				int poppedData = i[leftStart];
				i[--leftStart] = null;
				return poppedData;
			}
		}else if(stackId == 2)
		{
			if(rightStart == size)
			{
				throw new EmptyStackException();
			}else
			{
				int poppedData = i[rightStart];
				i[++rightStart] = null;
				return poppedData;
			}
		}else
		{
			return -0;
		}
		
	}
	
	public String getArray()
	{
		return Arrays.toString(i);
	}

}

