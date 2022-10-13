package oct13.codeup;

import java.util.Scanner;

public class CU1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = (((a < b)? a : b) < c ) ? ((a < b)? a : b) : c;
        System.out.println(n);
    }
}
