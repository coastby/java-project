package oct06.set;

import oct05.calculator.NumberGenerater;
import oct05.calculator.RandomNumberGenerater;

import java.util.HashSet;
import java.util.Set;

public class RandomOnlyNumber {
    public static void main(String[] args) {
        NumberGenerater randomNumberGenerater = new RandomNumberGenerater();
        Set<Integer> onlyNumbers = new HashSet<>();
        for (int i = 0; i < 50; i++) {
            int r = randomNumberGenerater.generate(10);
            System.out.println(r);
            onlyNumbers.add(r);
        }

        System.out.println("중복 제거 시 총 " + onlyNumbers.size() + "개입니다.");
        for (Integer onlyNumber : onlyNumbers) {
            System.out.println(onlyNumber);
        }


    }

}
