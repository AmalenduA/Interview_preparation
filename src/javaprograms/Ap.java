package javaprograms;

import java.util.Scanner;

public class Ap {

	 static void printAP(int a, int d, int n) {
	        int current = a;
	        for (int i = 1; i <= n; i++) {
	            System.out.print(current + " ");
	            current += d;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in); 
	            int a, d, n;
	            System.out.println("Enter the values of a, d and n: ");
	            a = sc.nextInt();
	            d = sc.nextInt();
	            n = sc.nextInt();

	            printAP(a, d, n);
	        }
	    
}
