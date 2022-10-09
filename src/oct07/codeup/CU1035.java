package oct07.codeup;

import java.util.Scanner;

public class CU1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next(), 16);
        System.out.println(Integer.toOctalString(num));
    }
}
