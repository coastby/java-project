package oct07.codeup;

import java.util.Scanner;

public class CU1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        String[] ts = t.split(":");
        int n = Integer.parseInt(ts[1]);
        System.out.println(n);
    }
}
