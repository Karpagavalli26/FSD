package fundamentals;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		//Task 4
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value 1: ");
		int a=sc.nextInt();
		System.out.println("Enter value 1: ");
		int b=sc.nextInt();
		System.out.println("Enter operator(+,-,*,/: )");
		String op=sc.next();
		 
		switch(op) {
		case "+":
			System.out.println("Result: "+ (a+b));
			break;
		case "-":
			System.out.println("Result: "+ (a-b));
			break;
		case "*":
			System.out.println("Result: "+ (a*b));
			break;
		case "/":
			 if (b!= 0) {
                 System.out.println("Result: " + ((double) a / b));
             } else {
                 System.out.println("Cannot divide by zero.");
             }
		default:
			System.out.println("Wrong Operator");
			
			
		}
		// TODO Auto-generated method stub

	}

}
