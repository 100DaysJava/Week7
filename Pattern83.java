package Patterns4;
public class Pattern83 {
			public static void main(String[] args) {
				int n = 5;
				for(int i = n ; i >= 1; i--) // i = 5, 4, 3,2,1 rows
				{
					for(int j = n-1;  j >= i; j--) // j =4 >= 4 -> t
						System.out.print(" "); // 0,1,2,3,4
					for(int k = 1; k <= i; k++) // k =4,3,2,1
					System.out.print((char)(k+64)+" "); //5,4,3,2,1
					
					System.out.println();			
				}
	}	}

