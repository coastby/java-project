package oct07.codeup;

import java.util.Scanner;

public class CU1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 4; i >= 0; i--) {
            int result = (int) (num/(Math.pow(10, i))) * (int) (Math.pow(10, i));
            num -= result;
            System.out.println("["+result+"]");
        }
    }
}
