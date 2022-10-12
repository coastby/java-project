package oct12;

import java.util.Scanner;

public class CU2081 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //최대값을 담을 변수
    int M = 0;
    //최대값이 있는 자리를 담을 변수
    int N = 0;
    //정수를 하나씩 받는다
    for (int i = 0; i < 9; i++) {
        int a = sc.nextInt();
        //최대값과 비교하여 다음수가 더 크면 최대값과 순서를 변수에 저장한다
        if (a > M) {
            M = a;
            N = i+1;
        }
    }
    System.out.println(M);
    System.out.println(N);
}
}
