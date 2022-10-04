package Oct04;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
