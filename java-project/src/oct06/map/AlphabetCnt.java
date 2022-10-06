package oct06.map;

import java.util.HashMap;

public class AlphabetCnt {
    //해당 캐릭터가 알파벳이면 true, 아니면 false 반환
    static boolean isAlphabet(char ch) {
        boolean result = false;
        //ch를 아스키로 바꾸지 않아도 바로 비교 가능
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "aAAaab...bbcc//dd-efft-gg".toUpperCase();
        HashMap<Character, Integer> alphabetMap = new HashMap<>();

        //알파벳 키값 세팅
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabetMap.put(c, 0);
        }
        //하나씩 찾아서 카운팅
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (isAlphabet(ch)) {
                alphabetMap.put(ch, alphabetMap.get(ch)+1);
            }
        }
        System.out.println(alphabetMap);

    }
}
