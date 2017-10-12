package cache;

import java.util.HashMap;
import java.util.Random;

public class RunCache 
{
	
	public static void main(String[] args) 
	{
		
		IContainer container = new  Container();
		HashMap<String,String> c = container.getContainer();
		
		IInsert in = new Insert(c);
		for(int i=0;i<7;i++)
		{
			in.insertData(String.valueOf(i), String.valueOf(i*10), "container1");
		}
		
		
		
	}

}
