
package hello;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        int at = email.indexOf("@");

        String username = email.substring(0, at);
        String domain = email.substring(at + 1);

        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);

        sc.close();
    }
}
