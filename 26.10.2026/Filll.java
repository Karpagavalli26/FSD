package array;

import java.util.Arrays;

public class Filll{
    public static void main(String[] args) {
        int[] arr = new int[5];

        Arrays.fill(arr, 100);

        System.out.println(Arrays.toString(arr));
    }
}