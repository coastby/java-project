package oct06.set;

import java.util.HashSet;
import java.util.Set;

public class RandomOnlyAlphabet {
    public static void main(String[] args) {
        //무작위 알파벳 생성을 위한 객체
        Generater alphabetGenerater = new AlphabetGenerater();
        //알파벳을 중복없이 담을 셋 생성
        Set<String> onlyAlphaabet= new HashSet<>();

        //무작위 알파벳 생성 및 셋에 삽입 및 출력
        for (int i = 0; i < 50; i++) {
            String s = alphabetGenerater.generate();
            onlyAlphaabet.add(s);
            System.out.print(s+" ");
        }

        //셋 아이템 개수 및 아이템 출력
        System.out.println("\n생성된 알파벳 수는" + onlyAlphaabet.size() + "개 입니다.");
        System.out.println(onlyAlphaabet);
    }
}
