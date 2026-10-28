package Exception;

public class Throww {
    public static void main(String[] args) {
        int age = 15;

        try {
            if (age < 18) {
                throw new ArithmeticException("Not eligible");
            }
            System.out.println("Eligible");
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
