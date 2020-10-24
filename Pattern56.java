
package Patterns2;
public class Pattern56 {
	public static void main(String[] args) {
		int n =4;
		
		for(int i=1; i<=n; i++) // i = 1,2,3, 4 rows
		{
		 for(int j =n-1; j>= i; j--) // j = 3,2,1,0		
			System.out.print(" "); // 3 spaces
									
		 for(int k=i-1; k >= -(i-1); k-- )  
			 // k =1-1 =0; 0 >= 0 ; // 1 row
			 //2 row
			 // k=2-1= 1; 1 >= -(2-1)= -1
			 // k=0; 0 >= -1; k--
			 // k=-1; -1 >= -1; k--
			System.out.print(i-Math.abs(k)); 
		 // 1-0= 1	 		-> 1 row 
		//2- 1= 1, 	2-0 =2,  2-1=1		 -> 2 row			
		System.out.println();		
		}
}}
