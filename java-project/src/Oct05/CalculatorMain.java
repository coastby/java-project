package Oct05;
public class CalculatorMain {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;

        Calculator calculator = new Calculator();

        calculator.plus(a, b);
        calculator.minus(a, b);
        calculator.multiple(a, b);
        calculator.devide(a, b);

    }
}
