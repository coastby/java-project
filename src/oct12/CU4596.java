package oct12;

import java.util.Scanner;

public class CU4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = 0;
        int row = 0;
        int col = 0;

        for (int i = 0; i < 81; i++) {
            int a = sc.nextInt();
            if (a > M) {
                M = a;
                row = i/9 + 1;
                col = i%9 + 1;
            }
        }
        System.out.println(M+"\n"+row+" "+col);
    }
}
