package cache;

import java.util.HashMap;

public class Insert implements IInsert
{

	private HashMap<String, String> container;
	
	public Insert(HashMap<String, String> container)
	{
		this.container = container;
	}
	
	public void insertData(String key, String value, String containerName) 
	{
		if(containerName.equals("container1"))
		{
			System.out.println("Inserting into container1");
			boolean isContainerFull = checkIfContainerIsFull(containerName);
			if(!isContainerFull)
			{
				container.put(key, value);
				
			}
		}else if(containerName.equals("container2"))
		{
			System.out.println("Inserting into container 2");
			
		}
		
		
	}
	
	
	private boolean checkIfContainerIsFull(String containerName)
	{
		if(containerName.equals("container1"))
		{
			if(container.size() == 5)
			{
				System.out.println("Container1 is full. Cannot insert more values");
				return true;
			}
			
		}else if(containerName.equals("container1")) 
		{
			if(container.size() == 10){
				return true;
			}
		}else
		{
			System.out.println( "Container name is not recognized. It should be either container1, container2, container3");
		}
		return false;
	}
	
	private int getContainerSize(String containerName)
	{
		if(containerName.equals("container1"))
		{
			return container.size();
		}
		return 0;
	}
	

}
