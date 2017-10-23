package allAlgos;

public class CountSort 
{

	
	public static void main(String[] args) {
		int i[] = {5,4,7,2,8,9,0};
		
		int counter[] = new int[10];
		for(int j=0;j<10;j++)
		{
			counter[j] = 0;
		}
		
		for(int j =0;j<i.length;j++)
		{
			counter[i[j]] = counter[i[j]]+1;
		}
		
		for(int j=0;j<counter.length;j++)
		{
//			System.out.println(j);
			if(counter[j] > 0)
			{
				System.out.println(j);
			}
		}
	}
}
