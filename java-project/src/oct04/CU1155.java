package oct04;

import java.util.Scanner;

public class CU1155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n%7 == 0) {
            System.out.println("multiple");
        } else {
            System.out.println("not multiple");
        }
    }
}
