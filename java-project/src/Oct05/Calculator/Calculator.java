package Oct05.Calculator;

public class Calculator {
    private NumberGenerater numberGenerater;
    private int baseNum = 10;
    public Calculator (NumberGenerater numberGenerater){
        this.numberGenerater = numberGenerater;
    }

    public Calculator(NumberGenerater numberGenerater, int baseNum) {
        this.numberGenerater = numberGenerater;
        this.baseNum = baseNum;
    }

    public void plus (int num) {
        int result = num + numberGenerater.generate(num);
        System.out.println(result);
    }
    public void minus (int num) {
        int result = num - numberGenerater.generate(num);
        System.out.println(result);
    }
    public void multiple (int num) {
        int result = num * numberGenerater.generate(num);
        System.out.println(result);
    }

}
