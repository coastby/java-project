package oct06.set;

import oct05.calculator.AlphabetGenerater;
import oct05.calculator.Generater;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RandomOnlyAlphabet {
    public static void main(String[] args) {
        Generater alphabetGenerater = new AlphabetGenerater();
        Set<String> onlyAlphaabet= new HashSet<>();

        for (int i = 0; i < 50; i++) {
            String s = alphabetGenerater.generate();
            onlyAlphaabet.add(s);
            System.out.print(s+" ");
        }

        System.out.println("\n생성된 알파벳 수는" + onlyAlphaabet.size() + "개 입니다.");
        System.out.println(onlyAlphaabet);


    }


}
