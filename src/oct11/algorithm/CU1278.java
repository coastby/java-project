package oct11.algorithm;

import java.util.Scanner;

public class CU1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;
        while (true) {
            cnt++;
            a = a/10;
            if (a == 0){
                break;
            }
        }
        System.out.println(cnt);
    }
}
