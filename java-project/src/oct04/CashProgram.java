package oct04;

import java.util.Scanner;

public class CashProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("금액을 넣으세요:[숫자입력]");
        int total = sc.nextInt();
        int[] curr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        for(int i = 0; i < curr.length; i++) {
            int cnt = total/curr[i];
            total %= curr[i];
            System.out.println(curr[i] + "원? " + cnt +"개");
        }
    }
}
