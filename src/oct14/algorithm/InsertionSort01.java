package oct14.algorithm;

import java.util.Arrays;

public class InsertionSort01 {
    //2중 for문을 사용한 삽입정렬
    public int[] insertionSort (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }
    //재귀를 사용한 삽입 정렬
    public int[] sort(int[] arr, int i) {
        if (i == arr.length) return arr;
        for (int j =i; j > 0; j--) {
            if (arr[j] < arr[j-1]) {
                int tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tmp;
            } else {
                break;
            }
        }
        return sort(arr, i+1);
    }

    public static void main(String[] args) {
        int[] arr = {3,7,12,6,2};
        InsertionSort01 is = new InsertionSort01();
        arr = is.sort(arr, 1);
        System.out.println(Arrays.toString(arr));
    }
}
