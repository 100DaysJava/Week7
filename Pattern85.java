
package Patterns4;
public class Pattern85 {
		public static void main(String[] args) {
		int n = 4;
		int x = 1;
		for(int i = n; i >= -n; i--) 
			// i = 4,3,2,1,0,-1,-2,-3,-4 -> 9rows
		{
			for(int j=1; j <= Math.abs(i); j++) // j= 1 <= 4
			  System.out.print(" "); // 4,3,2,1,0,1,2,3,4 spaces
			
			for(int k= n; k >= Math.abs(i); k--) // 4 >= 4
				 System.out.print(x + " "); // 1,2,3,4,5,4,3,2,1
			
			if( i>0)
			x=x+1;  // x=2,3,4,5
			else
			x=x-1;  // if i = 0,-1,-2,-3 then x=4,3,2,1
			
			System.out.println();		
		}
	} }

