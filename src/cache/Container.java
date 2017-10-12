package cache;

import java.util.HashMap;

public class Container implements IContainer
{

	
	public HashMap<String, String> getContainer() 
	{
		return createMap();
	}
	
	private HashMap<String, String> createMap()
	{
		HashMap<String, String> map = new HashMap<String,String>();
		return map;
	}
	
	

}
