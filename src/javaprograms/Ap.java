package javaprograms;

import java.util.Scanner;

public class Ap {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in); 
	            int a, d, n;
	            System.out.println("Enter the values of a, d and n: ");
	            a = sc.nextInt();
	            d = sc.nextInt();
	            n = sc.nextInt();
	            for (int i = 1; i <= n; i++) {
		            System.out.print(a + " ");
		            a += d;
		        }
	           
	        }
	    
}
