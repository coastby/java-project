package oct11.codeup;

import java.util.Scanner;

public class CU1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;
        while (a > 0) {
            cnt++;
            a = a/10;
        }
        System.out.println(cnt);
    }
}
