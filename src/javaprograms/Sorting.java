package javaprograms;

public class Sorting {

	 public static void main(String[] args) {
	        int[] arr = {10, 5, 20, 5, 5, 30};

	      
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = 0; j < arr.length - i - 1; j++) {
	                if (customCompare(arr[j], arr[j + 1]) > 0) {
	                    // Swap elements
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	       
	        System.out.print("Sorted array: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }

	    
	    private static int customCompare(int a, int b) {
	        if (a == b) return 0;
	        if (a == 10) return -1; 
	        if (b == 10) return 1;
	        if (a == 20) return -1; 
	        if (b == 20) return 1;
	        if (a==30) return -1;
	        if (b==30) return 1;
	        return Integer.compare(a, b); 
	    }
}
