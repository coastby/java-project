package oct05.codeUp;

import java.util.Arrays;
import java.util.Scanner;

public class CU1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] date = s.split("[.]");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}
