package Assignment;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter marks for Subject 1: ");
        int marks1 = scanner.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int marks2 = scanner.nextInt();
        scanner.close();
        if (marks1>=40 && marks2>=40)
        {
        	System.out.println("Result: Pass");
        }
        else
        {
        	System.out.println("Result:Fail");
        }
       
	}

}
