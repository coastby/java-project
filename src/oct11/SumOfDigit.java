package oct11;

import java.util.*;


public class SumOfDigit {
    public int solution1(int n) {
        //n을 String으로 변환
        String str = String.valueOf(n);
        int answer = 0;
        //String을 loop를 돌면서 parseIng로 더한다.
        for (int i = 0; i <str.length(); i++) {
            answer += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return answer;
    }
    public int solution(int n) {
        // 나머지, 몫 이용
        int answer = 0;
        while (n > 0) {
            answer += n%10;
            n = n/10;
        }
        return answer;
    }

    public int solution3 (int n) {
        int result = 0;
        System.out.println(n/10);       //123
        System.out.println(n%10);
        n = n/10;
        System.out.println(n/10);       //123
        System.out.println(n%10);       //4

        return result;
    }




    public static void main(String[] args) {
        //687 = 6 + 8 + 7 = 21
        SumOfDigit sod = new SumOfDigit();
        int result1 = sod.solution3(1234);

        if (result1 == 10) {
            System.out.println("good");
        } else {
            System.out.println("fail");
        }
    }
}
