package sort;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		int a[] = {3,4,1,5,2,-5,3};
		int  key,j, temp;
		
		for(int i=1;i<a.length;i++)
		{
			key = a[i];
			j=i-1;
			while(j>=0 && key<a[j])
			{
				temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				j--;
			}
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	
	

}
