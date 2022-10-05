package Oct05.Calculator;

import Oct05.Calculator.NumberGenerater;

public class TenNumberGenerater implements NumberGenerater {
    @Override
    public int generate(int num) {
        return 10*num;
    }
}
