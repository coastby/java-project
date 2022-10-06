package oct06.set;

public class AlphabetGenerater implements Generater{
    @Override
    public String generate() {
        int intForChar = (int) (Math.random()*26 + 65);
        char ch = (char) intForChar;
        String s = String.valueOf(ch);
        return s;
    }
}
