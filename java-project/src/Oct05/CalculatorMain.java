package Oct05;
public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 50);

        calculator.plus();
        calculator.minus();
        calculator.multiple();
        calculator.devide();

        RandomCalculator r = new RandomCalculator(5);
        r.plus();
        r.minus();
        r.multiple();
        r.divide();

    }
}
