package Oct05.Calculator;

public class Main {
    public static void main(String[] args) {
        NumberGenerater rnumberGenerater = new RandomNumberGenerater();
        Calculator randomCalculator = new Calculator(rnumberGenerater);
        randomCalculator.plus(10);

        NumberGenerater bnumberGenerater = new ByPassNumberGenerater();
        Calculator byPassCalculator = new Calculator(bnumberGenerater, 50);
        randomCalculator.plus(10);
    }
}
