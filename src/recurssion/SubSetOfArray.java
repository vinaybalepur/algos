package recurssion;



public class SubSetOfArray 
{
	
	public static void main(String[] args) {
		int x[] = {1,2,3};
		findSubsets(x, 0);
	}
	static void findSubsets(int[] x, int k)
	{
		if(k==x.length)
		{
			for(int i=0;i<x.length;i++) 
			{
				System.out.print("{" + x[i]  + "}");
				System.out.println();
			}
		}else
		{
			for (int i = k; i < x.length; i++) 
            {
                int temp = x[k];
                x[k] = x[i];
                x[i] = temp;
                System.out.println();
                findSubsets(x, k + 1);
 
                temp = x[k];
                x[k] = x[i];
                x[i] = temp;
            }
		}
	}

}
