package allAlgos;

public class PageTurns 
{
	public static void main(String[] args) {
		int pageTurn = solve(6, 5);
		System.out.println(pageTurn);
	}
	
	
	 static int solve(int n, int p)
	 {
	     int pageTurn = 0;   
		 int midpoint = n/2;
		 if(p>midpoint)
		 {
			 //from backend
			 if(n %2 == 0)
			 {
				 //evenpages
				 for(int i=n;i>midpoint-1;i--)
				 {
					 if(i == p)
					 {
						 break;
					 }else if(i == p || (i-1) == p)
					 {
						 ++pageTurn;
						 break;
					 }else if(i != n)
					 {
						 i=i-1;
					 }
				 }
			 }else
			 {
				 //oddpages
				 for(int i=n;i>midpoint-1;i--)
				 {
					 if(i== p || (i-1) == p)
					 {
						 break;
					 }else
					 {
						 ++pageTurn;
						 i = i-1;
					 }
				 }
			 }
		 }else
		 {
			 //from front end
			 if(n %2 == 0)
			 {
				 //evenpages
				 for(int i=1;i<midpoint+1;i++)
				 {
					 if(i == p)
					 {
						 break;
					 }else if(i == p || (i+1) == p)
					 {
						 ++pageTurn;
						 break;
					 }else if(i != n)
					 {
						 i=i+1;
					 }
				 }
			 }else
			 {
				 //oddpages
				 for(int i=1;i<midpoint+1;i++)
				 {
					 if(i== p)
					 {
						 break;
					 }else if(i == 1)
					 {
						 ++pageTurn;
						 
					 }else
					 {
						 if(i == p || (i+1) == p)
						 {
							 break;
						 }else
						 {
							 i = i+1;
						 }
					 }
				 }
			 }
		 }
		return pageTurn;
	 }
}
