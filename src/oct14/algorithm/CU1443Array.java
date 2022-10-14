package oct14.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

//길이가 정해지지 않은 입력에서 삽입정렬을 이용하여 오름차순으로 출력
//문제1) 숫자를 입력 후 enter로 입력을 마치고 싶은데 아직 구현 x → 숫자 아닌 문자 입력해야 입력을 마칠 수 있다.
public class CU1443Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            list.add(a);
        }
        for (int i = 1; i < list.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (list.get(j) < list.get(j-1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j-1));
                    list.set(j-1, temp);
                }
            }
        }
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
