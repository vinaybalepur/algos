package allAlgos;

public class HackerRankString
{
	
	public static void main(String[] args) {
		String s = "hackerrank";
		char c[] = s.toCharArray();
		
		String givenString = "hackerworldrrank";
		
		char gs[] = givenString.toCharArray();
		
		int j =0;
		String newString = "";
		for(int i=0;i<givenString.length();i++)
		{
			char c1 = gs[i];
			if(c1 == c[j])
			{
				newString = newString+c1;
				++j;
			}
		}
		System.out.println(newString );
		if(newString.equals(s))
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
	}

}
