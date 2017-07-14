package recurssion;

public class IntSubSet {

	
	public static void main(String[] args) 
	{
		
		int[] i = {1,2,3};
		boolean shouldAdd[] = new boolean[i.length];
		subSet(i, shouldAdd, 2, 0, 0);
	}
	
	static void subSet(int i[], boolean shouldAdd[], int size, int start, int currentLen)
	{
	
		if(currentLen==size)
		{
			for(int j=0;j<i.length;j++)
			{
				if(shouldAdd[j] == true)
				{
					System.out.print(i[j]);
				}
				
			}
			System.out.println();
		}
		if(start==i.length)
		{
			return;
		}
		
		shouldAdd[start] = true;
		subSet(i, shouldAdd, size, start+1, currentLen+1);
		
		shouldAdd[start] = false;
		subSet(i, shouldAdd, size, start+1, currentLen);
	}
	
	
}
