package threads;

public class TablesMain 
{
	
	public static void main(String[] args) 
	{
		CreateTables ct = new CreateTables();
		RunTables r1 = new  RunTables(ct, 5);
		RunTables r2 = new  RunTables(ct, 2);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
	}

}
