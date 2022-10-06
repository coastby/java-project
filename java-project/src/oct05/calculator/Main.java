package oct05.calculator;

public class Main {
    public static void main(String[] args) {
        //plus의 파라미터와 baseNum의 초기값인 10 미만의 정수와 더해준다.
        NumberGenerater rnumberGenerater = new RandomNumberGenerater();
        Calculator randomCalculator = new Calculator(rnumberGenerater);
        randomCalculator.plus(20);
        randomCalculator.minus(20);
        randomCalculator.multiple(20);


        //baseNum과 plus의 파라미터를 더해준다.
        Calculator byPassCalculator = new Calculator(new ByPassNumberGenerater(), 50);
        byPassCalculator.plus(20);
        byPassCalculator.minus(20);
        byPassCalculator.multiple(20);
    }
}
