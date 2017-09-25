package allAlgos;

public class Anagrams 
{
	
	public static void main(String[] args) {
		String s = "cat";
		
		char c[] = s.toCharArray();
		String n="";
		do {
			for(int i=0;i<c.length-1;i++)
			{
				char temp = c[i];
				c[i] = c[i+1];
				c[i+1] = temp;
				System.out.println(String.valueOf(c));
			}
			
		}while(!(String.valueOf(c).equals(s)));
			
	}

}
