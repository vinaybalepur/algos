package allAlgos;

public class FunnyString 
{
	
	public static void main(String[] args) {
		String s = "bcxz";
		char c[] = s.toCharArray();
		int j= s.length()-1;
		boolean funny = true;
		for(int i=0;i<s.length()-1;i++)
		{
			int left = Math.abs((int)(c[i+1] - c[i]));
			int right = Math.abs((int)(c[j-1]-c[j]));
			if(left != right)
			{
				funny = false;
				break;
			}
			j--;
		}
		System.out.println(funny);
	}

}
