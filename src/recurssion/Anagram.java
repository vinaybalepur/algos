package recurssion;

public class Anagram 
{
	
	public static void main(String[] args) {
	
		String s = "cat";
		System.out.println(s.substring(0,0)); // from 0th position give me 0 characters
		System.out.println(s.substring(1));   // from 1st position give me remaining characters
		
		System.out.println(s.substring(0,1)); // from 0th position give me 1 character
		System.out.println(s.substring(2));   // from 2nd position give me remaining characters
		
		System.out.println(s.substring(0,2)); // from 0th position give me 2 characters
		System.out.println(s.substring(3));   // from 3rd position give me remaining characters
		
		createAnagram("",s);
	}
	
	
	/** 
	 * This method will take two parameters oldword and new word. Initially old word is blank and new word is the
	 * actual word passed. The else loop will run until we reach the end of the word. Every time it runs createAnagram method
	 * is called and the base case  will be only one letter left in the word. At this point the word will be 
	 * printed and after this the loop goes to else block. This is  repeated until we reach the end of the word.
	 * @param oldWord
	 * @param word
	 */
	static void createAnagram(String oldWord,String word)
	{
		if(word.length() <=1)
		{
			System.out.println(oldWord + word);
		}else
		{
			for(int i=0;i<word.length();i++)
			{
				String newWord = word.substring(0,i) + word.substring(i+1);
				String old = oldWord + word.charAt(i);
				createAnagram(old,newWord);
			}
		}
	}
}
