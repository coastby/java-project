package oct07.codeup;

import java.util.Scanner;

public class CU1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] ss = s.split("[.]");
        System.out.println(ss[2]+"-"+ss[1]+"-"+ss[0]);
    }
}
