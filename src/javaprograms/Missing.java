package javaprograms;

public class Missing {
	
	public static void main(String[] args) {
		int a[]= {2,6,8,10,12};
		int n=2;
		findMissing(a, n);
	}
	public static void findMissing(int a[],int n)
	{
		int d=(a[n-1]-a[0])/n;
		for(int i=0;i<n;i++)
		{
			int exp=a[i+1]-a[i];
			if(exp!=d) {
				System.out.println(a[i]+d);
			}
		}
		
	}

}
