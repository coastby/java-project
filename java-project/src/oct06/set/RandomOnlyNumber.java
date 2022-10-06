package oct06.set;

import oct05.calculator.NumberGenerater;
import oct05.calculator.RandomNumberGenerater;

import java.util.HashSet;
import java.util.Set;

public class RandomOnlyNumber {
    public static void main(String[] args) {
        //랜덤수 만들어 내기 위한 인스턴스 생성
        NumberGenerater randomNumberGenerater = new RandomNumberGenerater();
        //중복제거 위해 사용될 셋 생성
        Set<Integer> onlyNumbers = new HashSet<>();

        //0~9까지의 랜덤 수 50개 생성하고 출력 및 셋에 추가
        for (int i = 0; i < 50; i++) {
            int r = randomNumberGenerater.generate(30);
            System.out.print(r +" ");
            onlyNumbers.add(r);
        }

        //중복 제거 된 개수 출력
        System.out.println("\n중복 제거 시 총 " + onlyNumbers.size() + "개입니다.");
        //셋 안에 있는 내용물 출력
        System.out.println(onlyNumbers);


    }

}
