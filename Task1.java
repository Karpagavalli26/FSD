package fundamentals;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num =sc.nextInt(); 
		
		
		//Task 1
		if (num>0) {
			System.out.println("The given Number"+ num+" is Positive");
		 
		}
		else {
			System.out.println("The given Number"+ num+" is negative");
			
		}

	}

}
