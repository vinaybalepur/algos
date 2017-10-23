package allAlgos;

public class ReduceString 
{
	
	public static void main(String[] args) {
		String s = "helloVinay";
		StringBuilder sb = new StringBuilder(s);
		
//		System.out.println(sb.delete(0, 2));
		int l = sb.length();
	
		for(int i=0;i<sb.length()-1;i++)
		{
			if(sb.charAt(i) == sb.charAt(i+1))
			{
				sb.delete(i, i+2);
				i = -1;
				
			}
		}
		System.out.println(sb);
	}
}
