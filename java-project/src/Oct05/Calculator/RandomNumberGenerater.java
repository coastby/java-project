package Oct05.Calculator;

import Oct05.Calculator.NumberGenerater;

public class RandomNumberGenerater implements NumberGenerater {
    @Override
    public int generate(int num) {
        return (int) (Math.random()*num);
    }
}
