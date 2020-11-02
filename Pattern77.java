
package Patterns3;
public class Pattern77 {
		public static void main(String[] args) {
			int n = 5;
			for(int i = 1; i<= n; i++)  // i = 1, 2,3,4,5
			{
				for(int k = n-1; k >= i; k--) // k =4 > = 5
				{
					System.out.print(" "); // 4,3,2,1,0 -> spaces
				}
				for(int j = 1; j <=i ; j++ ) // 1<=5
				{
					System.out.print((char)(j+64)+" "); // 1,2,3,4,5 -> star
				}
				System.out.println();
			}
	}}

