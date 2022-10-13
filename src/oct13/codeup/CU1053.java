package oct13.codeup;

import java.util.Scanner;

//C언어에서는 boolean을 0과1로 표현하는데 자바에서는 true, false로 표현한다.
//따라서 이 문제는 자바에서는 조건문으로 접근할 수 밖에 없었다.
public class CU1053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a == 0 ? 1 : 0;
        System.out.println(b);
    }
}
