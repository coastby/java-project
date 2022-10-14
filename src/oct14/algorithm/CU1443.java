package oct14.algorithm;

import java.util.Scanner;

public class CU1443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            for (int j = i; j >0; j--) {

                if (arr[j] <arr[j-1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
