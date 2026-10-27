package hello;
public class StringBufffer{
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("1. Append: " + sb.append(" Java"));

        System.out.println("2. Insert: " + sb.insert(5, " World"));

        System.out.println("3. Replace: " + sb.replace(0, 5, "Hi"));

        System.out.println("4. Delete: " + sb.delete(0, 3));

        System.out.println("5. Reverse: " + sb.reverse());

        System.out.println("6. Capacity: " + sb.capacity());

        sb.ensureCapacity(50);
        System.out.println("7. Ensure Capacity: " + sb.capacity());

        System.out.println("8. Length: " + sb.length());

        System.out.println("9. CharAt: " + sb.charAt(0));

        System.out.println("10. IndexOf: " + sb.indexOf("Java"));
    }
}
