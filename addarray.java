package oprerators;

import java.util.Scanner;

public class addarray {

	public static void main(String[] args) {
		int [][] a=new int[10][10];
		int [][] b=new int[10][10];
		Scanner sc=new Scanner (System.in);
		for (int i=0;i<2;i++)
			for (int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
				b[i][j]=sc.nextInt();			}
		for (int i=0;i<2;i++)
			for (int j=0;j<2;j++)
			{
				System.out.println(a[i][j]);
				System.out.println(b[i][j]);
			}
		for (int i=0;i<2;i++)
			for (int j=0;j<2;j++)
			{
		       int [][] c=new int[10][10];
		       int c[i][j]=a[i][j]+b[i][j];
			}
		System.out.println(c[i][j]);
		

	}

}
