package Patterns4;
public class Pattern86 {
	public static void main(String[] args) {
		int n = 4;
		int x=1;
		
		for(int i=n; i>= -n; i--) // i = 4,3,2,1,0,-1,-2,-3,-4
		{
		  for(int j=1 ; j <= Math.abs(i); j++) //j= 1 <= 1
			  System.out.print(" "); // 4,3,2,1,0,1 -> spaces
		  
		  x = 1;
		  for(int k= n; k>=Math.abs(i); k--) // k=4-1
		  {
			  System.out.print(x+" "); //1 2 3 4 
		      x=x+1; // x=2,3,4
		  }
		  System.out.println();
		}
	} }
