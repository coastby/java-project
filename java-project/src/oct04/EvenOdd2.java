package oct04;

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
        int L = sc.nextInt();
        int R = sc.nextInt();

        System.out.printf("%s+%s=%s", getEvenOdd(L), getEvenOdd(R), getEvenOdd(L+R));
    }
}

