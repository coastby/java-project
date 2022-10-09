package oct07.codeup;

import java.util.Scanner;

public class CU1033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toHexString(n);
        System.out.println(s.toUpperCase());
    }
}
