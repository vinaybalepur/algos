package allAlgos;

public class CountAllValues 
{
	
	public static void main(String[] args) 
	{
		int size = 100;
		int i[] = {63,25,73,1,98,73,56,84,86,57,16,83,8,25,81,56,9,53,98,67,99,12,83,89,80,91,39,86,76,85,74,39,25,90,59,10,94,32,44,3,89,30,27,79,46,96,27,32,18,21,92,69,81,40,40,34,68,78,24,87,42,69,23,41,78,22,6,90,99,89,50,30,20,1,43,3,70,95,33,46,44,9,69,48,33,60,65,16,82,67,61,32,21,79,75,75,13,87,70,33};
		getCount(i, size);
		//		Integer j[] = new Integer[size];
//		Integer count[] = new Integer[size];
//		for(int k=0;k<size;k++)
//		{
//			j[k] = k;
//			count[k] = 0;
//		}
//	
//		
//		for(int k=0;k<i.length;k++)
//		{
//			int key = i[k];
//			count[key] = count[key] + 1;
//		}
//	
//		for(int k=0;k<i.length;k++)
//		{
//			if(count[k]!=0)
//			{
//				for(int l=0;l<count[k];l++)
//				{
//					System.out.println(k);
//				}
//			}
//		}
	}
	
	static void getCount(int i[], int size)
    {
        int counter = 100;
        Integer j[] = new Integer[100];
		Integer count[] = new Integer[100];
		for(int k=0;k<counter;k++)
		{
			j[k] = k;
			count[k] = 0;
		}
	
		
		for(int k=0;k<size;k++)
		{
			int key = i[k];
			count[key] = count[key] + 1;
		}
        
         for(int k=0;k<count.length;k++)
        {
        	 if(count[k]!=0)
 			{
 				for(int l=0;l<count[k];l++)
 				{
 					System.out.print(k + " ");
 				}
 			}
        }
    }

}
