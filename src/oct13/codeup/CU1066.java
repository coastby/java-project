package oct13.codeup;

import java.util.Scanner;

public class CU1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            if (a%2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
