package oct05.calculator;

public class ByPassNumberGenerater implements NumberGenerater{
    @Override
    public int generate(int num) {
        return num;
    }
}
