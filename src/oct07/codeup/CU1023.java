package oct07.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class CU1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //.으로 split할 때 주의
        String[]ss = s.split("[.]");
        System.out.println(ss[0]);
        System.out.println(ss[1]);
    }
}
