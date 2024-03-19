package javaprograms;

public class BinarySearch {
	
	
	public static void binary(int low,int high,int key,int a[])
	{
		int mid=(low+high)/2;
		while(low<=high)
		{
			if(a[mid]<key){
				
				low=mid+1;
				
			}else if(key==a[mid]) {
				
				System.out.println(key+" present at index "+mid);
				
			}else {
				high=mid-1;
			}
			mid=(low+high)/2;
		}
		if(low>high)
		{
			System.out.println("element not found");
		}
		
	}
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		int key=60;
		int low=0;
		int high=a.length-1;
		binary(low,high,key,a);
	}
}
