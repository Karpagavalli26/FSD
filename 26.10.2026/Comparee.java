package array;

import java.util.Arrays;

public class Comparee{
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = {10, 20, 40};

        int result = Arrays.compare(a, b);

        System.out.println(result);
    }
}
