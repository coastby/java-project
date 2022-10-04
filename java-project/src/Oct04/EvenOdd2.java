package Oct04;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOdd2 {

    private static String getEvenOdd (int num) {
        if (num%2 ==0){
            return "짝수";
        }
        return "홀수";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        String[] arr = nums.split(" ");
        int L = Integer.parseInt(arr[0]);
        int R = Integer.parseInt(arr[1]);

        System.out.printf("%s+%s=%s", getEvenOdd(L), getEvenOdd(R), getEvenOdd(L+R));
    }
}

