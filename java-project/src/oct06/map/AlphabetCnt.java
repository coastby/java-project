package oct06.map;

public class AlphabetCnt {
    //해당 캐릭터가 알파벳이면 true, 아니면 false 반환
    static boolean isAlphabet(char ch) {
        boolean result = true;
        if (ch < 65 || (ch > 90 && ch < 97) || ch >122) {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "aaabbbcc//dd-efft-gg";

        //String을 한 글자씩 출력
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (isAlphabet(ch)) {
                System.out.println(ch);
            }
        }

    }
}
