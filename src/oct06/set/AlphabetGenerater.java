package oct06.set;

public class AlphabetGenerater implements Generater{
    @Override
    public String generate() {
        //아스키코드에 해당하는 무작위 번호 생성
        int intForChar = (int) (Math.random()*26 + 65);
        //정수 > 문자
        char ch = (char) intForChar;
        //문자 > 문자열
        String s = String.valueOf(ch);
        return s;
    }
}
