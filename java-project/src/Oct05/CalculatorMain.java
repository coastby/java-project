package Oct05;

class Calculator {
    public static int plus (int a, int b) {
        return a+b;
    }

    public static int minus (int a, int b) {
        return a-b;
    }

    public static int multiple (int a, int b) {
        return a*b;
    }
}

public class CalculatorMain {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;

        int plus = Calculator.plus(a, b);
        int minus = Calculator.minus(a,b);
        int multiple = Calculator.multiple(a,b);

        System.out.println(plus + " " + minus + " " + multiple);
    }
}
