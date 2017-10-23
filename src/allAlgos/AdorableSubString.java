package allAlgos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class AdorableSubString 
{
	
	public static void main(String[] args) {
		String s = "we::/a\\b::/c\\d";
		Pattern p = Pattern.compile("^[a-z]{1}(:{1,}?|[a-z]{1,}?|[0-9]{1,}?)/{1}[a-z]{1,}?\\\\{1}[a-z]{1,}?.*");
		
		for(int i=0;i<s.length();i++)
		{
			
			Matcher m = p.matcher(s.substring(i));
			if(m.matches())
			{
				System.out.println("true");
			}
		}
		
		String str = "abdcefghi";
		for(int i=0;i<str.length()-1;i++)
		{
			System.out.println(str.substring(i, i+1));
		}

	}
	
	
}
