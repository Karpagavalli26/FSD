package array;

import java.util.Arrays;

public class Copyy{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int[] copy = Arrays.copyOf(arr, 3);

        System.out.println(Arrays.toString(copy));
    }
}