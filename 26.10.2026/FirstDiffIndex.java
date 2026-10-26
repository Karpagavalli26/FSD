package array;

import java.util.Arrays;

public class FirstDiffIndex{
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int[] b = {10, 20, 35, 40};

        System.out.println(Arrays.mismatch(a, b));
    }
}
