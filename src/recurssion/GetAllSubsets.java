package recurssion;

public class GetAllSubsets 
{
	
	static String s ="123";

	public static void main(String[] args) {
		subSet("", s);
	}
	
//	static void subSets(String start, String remaining)
//	{
//		if(remaining.length() ==0)
//		{
//			System.out.println(start);
//		}else
//		{
//			subSets(start+remaining.charAt(0), remaining.substring(1));
//			subSets(start, remaining.substring(1));
//		}
//	}
	
	static void subSet(String start, String end)
	{
		if(end.length()==0)
		{
			System.out.println(start);
		}else
		{
			subSet(start+end.charAt(0), end.substring(1));
			subSet(start, end.substring(1));
		}
	}
}
