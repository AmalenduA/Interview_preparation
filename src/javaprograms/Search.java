package javaprograms;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]= {1,2,4,5,6};
		int flag=0;
		int pos=0;
		System.out.println("Enter the key element:");
		int key=s.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				flag=1;
				pos=i;
			}
		}
		
		if(flag==0)
		{
			System.out.println(key+" not present");
		}
		else
		{
			System.out.println(key+" present at "+pos);
		}
			
		
	}
}
