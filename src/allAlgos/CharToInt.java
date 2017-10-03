package allAlgos;

public class CharToInt 
{
	
	public static void main(String[] args) {
//		char c = 'a';
		char c[] = {'a', 'b', '4', '5', 'q', '6', 'r', '1', '2','6'};
		int counter =0;
		for(int i = 0;i<c.length;i++)
		{
			Character ch = new Character(c[i]);
			String s = ch.toString();
			
			try
			{
				Integer.valueOf(s);
				counter++;
			}catch(NumberFormatException n)
			{
				continue;
			}
			
		}
		System.out.println("Count of Numbers is " + counter);
	}

}
