import java.util.Scanner;
public class ArithmeticOp {
int a, b;
public static void main(String[] args) {
        ArithmeticOp obj = new ArithmeticOp();

        obj.Input();
        obj.Add();
        obj.Sub();
        obj.Mul();
        obj.div();
        obj.Mod();
    }
    void Input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
    }
    void Add() {
        System.out.println("Add= "+(a + b));
    }
    void Sub() {
        System.out.println("Sub =" +(a - b));
    }
    void Mul() {
        System.out.println("Mul =" +(a * b));
    }
    void div() {
        System.out.println("Div ="+(a / b));
    }

    void Mod() {
        System.out.println("Mod="+(a % b));
    }

    
}
