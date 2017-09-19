package threads;

public class GarbageCollection {

	public void finalize()
	{
		System.out.println("Garbage collected");
 	}
	
	public static void main(String[] args) {
		GarbageCollection g1 = new GarbageCollection();
		GarbageCollection g2 = new GarbageCollection();
		GarbageCollection g3 = new GarbageCollection();
		
		int i =10;
		g1 = null;
		g2 = null;
		g3= g2;
		i = 0;
		System.gc();
	}
}



