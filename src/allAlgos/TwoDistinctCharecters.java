package allAlgos;

public class TwoDistinctCharecters 
{
	
	public static void main(String[] args) {
		String s = "SSSSSSSSSSSSSSSOOOOOOOOOOOOOOOOOOOOOOOOOSSSSSSSO";
		String str = "";
		StringBuffer sb = new StringBuffer(s);
		int counter =0;
		while(true)
		{
			if(sb.length()>0)
			{
				String x = sb.substring(0, 3);
				if(!(x.equalsIgnoreCase("sos")))
				{
					if(x.toLowerCase().charAt(0)!='s')
					{
						counter = counter+1;
					}
					if(x.toLowerCase().charAt(1)!='0') {
						counter = counter+1;
					}
					if(x.toLowerCase().charAt(0)!='s')
					{
						counter= counter+1;
					}
					
				}
				sb.delete(0, 3);
			}else
			{
				System.out.println(counter);
				break;
			}
		}
	}

}
