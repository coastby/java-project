package oct13.codeup;

import java.util.Scanner;

public class CU1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (b >= a) ? 1 : 0;
        System.out.println(c);
    }
}
