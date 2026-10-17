
import java.util.Scanner;

public class ConditionalOp {
    int age, mark;
    public static void main(String[] args) {
        ConditionalOp obj = new ConditionalOp();

        obj.Input();
        obj.checkEligibility();
    }
    void Input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.print("Enter mark: ");
        mark = sc.nextInt();
    }

    void checkEligibility() {
        System.out.println("Eligible: " + (age >= 18 && mark >= 50));
    }

   
}
