package allAlgos;

public class FindFirstTwoHighestNumbers 
{
	public static void main(String[] args) {
		
		int in[] = {20,-5,10,9,100,50,45,92,125,0,300,110};
//		twoHighestNumbers(in);
		threeHighestNumbers(in);
	}
	
	static void twoHighestNumbers(int in[])
	{
		int maxone =0;
		int maxtwo =0;
		for(int i=0;i<in.length;i++)
		{
			if(in[i]>maxone )
			{
				maxtwo = maxone;
				maxone = in[i];
			}else if(maxtwo<in[i])
			{
				maxtwo = in[i];
			}
		}
		
		System.out.println(maxone);
		System.out.println(maxtwo);
	}
	
	static void threeHighestNumbers(int in[])
	{
		int maxone=0;
		int maxtwo=0;
		int maxthree=0;
		
		for(int i=0;i<in.length;i++)
		{
			if(in[i]>maxone)
			{
				maxthree = maxtwo;
				maxtwo = maxone;
				maxone = in[i];
			}else if(maxtwo<in[i])
			{
				maxthree = maxtwo;
				maxtwo = in[i];
			}else if(maxthree<in[i])
			{
				maxthree = in[i];
			}
		}
		
		System.out.println(maxone);
		System.out.println( maxtwo);
		System.out.println(maxthree);
	}

}
