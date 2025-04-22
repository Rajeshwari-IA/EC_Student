package oprerators;

import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first sub marks:");
		int a=sc.nextInt();
		System.out.println("Enter second sub marks:");
		int b=sc.nextInt();
		System.out.println("Enter third sub marks:");
		int c=sc.nextInt();
		float percentage=((a+b+c)*100)/300;
		System.out.println("percentage");
		System.out.println(percentage);
		if (percentage>=85)
			System.out.println("distinction");
		else
			System.out.println("first class");
		
	}

}
