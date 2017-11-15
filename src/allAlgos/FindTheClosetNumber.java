package allAlgos;

public class FindTheClosetNumber 
{
	
	public static void main(String[] args) {
		int i[] = {1,2,3,4,5};
		int n = 11;
		
		int diff = Integer.MIN_VALUE;
		
		for(int j=0;j<i.length;j++)
		{
			for(int k=j+1;k<i.length;k++)
			{
				if(i[j] + i[k] == n)
				{
					diff =n;
					break;
				}
				if((i[j] + i[k]) > diff)
				{
					diff = i[j] + i[k];
				}
			}
		}
		System.out.println(diff);
	}

}
