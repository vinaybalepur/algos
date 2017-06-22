package Stack;

public class CheckForBrackets 
{
	public static void main(String[] args) {
		String s = "{a[b]}}";
		
		StackOfArray sa = new StackOfArray(s.length());
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			switch (ch) {
			case '{':
			case '[':
				sa.push(ch);
				break;
			case '}': // closing symbols
			case ']':
			case ')':
				if(!sa.isStackEmpty())
				{
					char chx = sa.pop();
					if( (ch =='}' && chx!='{') || (ch == ']' && chx!='['))
					{
						System.out.println("Something went wrong");
					}else
					{
						System.out.println("All okay");
					}
					  
					
				}
			default:
				break;
			}
		}
	}
}
