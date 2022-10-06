package oct06.map;

import java.util.HashMap;

/**
 * String s에 있는 a~z까지 알파벳의 개수를 세는 알고리즘을 구현 해보세요.
 * 대소문자는 구별하지 않습니다.
 * */

public class MapExercise2 {
    //문자열을 변수로 받아서 알파벳 개수를 맵으로 반환하는 함수
    public static HashMap<Character, Integer> alphabetCount (String s) {
        HashMap<Character, Integer> result = new HashMap<>();
        //문자열을 대문자로 변환
        String upperS = s.toUpperCase();
        for (int i = 65; i <= 90; i++) {
            char ch = (char) i;
            String removedS = upperS.replace(String.valueOf(ch), "");
            int cnt = upperS.length() - removedS.length();
            result.put(ch, cnt);
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "aaaaabbb";
        HashMap<Character, Integer> map = alphabetCount(s);

        System.out.println(map);

    }
}
