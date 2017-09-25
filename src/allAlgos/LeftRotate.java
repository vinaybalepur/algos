package allAlgos;

import java.util.Arrays;

public class LeftRotate 
{
	
	public static void main(String[] args) {
		int i[] = {1,2,3,4,5};
		
		int k =4;
		int n = 0;
		while(n<4)
		{
			
			for(int j=0;j<i.length-1;j++)
			{
				int temp = i[j];
				i[j] = i[j+1]; 
				i[j+1] = temp;
			}
			n++;
		}
		
		System.out.println(Arrays.toString(i));
	}

}
