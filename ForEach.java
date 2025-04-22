package pack;

import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no. of elements in an array");
		int n=sc.nextInt();
		int [] arr=new int[10];
		int sum=0;
		for(int j=0;j<n;j++)
		{
			arr[j]=sc.nextInt();
		}
		for(int i:arr)
	       sum=sum+i;
		System.out.println(sum);
		
		int avg=sum/n;
		
		System.out.println(avg);
	}
}
	


