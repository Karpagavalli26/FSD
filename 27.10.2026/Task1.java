
package hello;

import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        int length = username.length();

        boolean hasSpace = username.contains(" ");

        boolean valid = length >= 5 && !hasSpace;

        System.out.println("Username: " + username);
        System.out.println("Length: " + length);
        System.out.println("Contains spaces: " + (hasSpace ? "Yes" : "No"));

        System.out.println("Username status: " +
                (valid ? "Valid" : "Invalid"));

        sc.close();
    }
}
