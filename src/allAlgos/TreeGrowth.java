package allAlgos;

public class TreeGrowth {

	public static void main(String[] args) {
		int n = 4;
		int treeheight=1;
		if(n ==0)
		{
			System.out.println("Tree growth is 1");
		}else
		{
			for(int i =0;i<n;i++)
			{
				if(i%2==1)
				{
					treeheight = treeheight+1;
				}else if(i%2==0)
				{
					treeheight = 2*treeheight;
				}
			}
			System.out.println(treeheight);
	
		}
	}
}
