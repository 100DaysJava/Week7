package Patterns4;
public class Pattren87 {
	public static void main(String[] args) {
		int n = 4;
		int x=1;
		int j;
		
		for(int i=n; i>= -n; i--) 
			// i = 4,3,2,1,0,-1,-2,-3,-4 -> 9 rows
		{
		  for( j=1 ; j <= Math.abs(i); j++) //j= 2 <= 1 -> f
			System.out.print(" "); // 4,3,2,1,0,1,2,3,4 -> spaces
		  
		  x = (i>0)?1:j;  // x = 2 
		  
		  for(int k= n; k>=Math.abs(i); k--) // k=4 >= 1
		  {
			  System.out.print(x+" "); //2 3 4 5 
		      x=x+1; // x=3,4,5
		  }
		  System.out.println();
		}
}}

