package oct05.calculator;

public class Calculator {
    private int left;
    private int right;
    private NumberGenerater numberGenerater;
    private int baseNum = 10;


    public Calculator (NumberGenerater numberGenerater){
        this.numberGenerater = numberGenerater;
        baseNum = 10;
    }

    public Calculator(NumberGenerater numberGenerater, int baseNum) {
        this.numberGenerater = numberGenerater;
        this.baseNum = baseNum;
    }

    public void plus (int num) {
        int left = num;
        int right = numberGenerater.generate(baseNum);
        int result = left + right;
        System.out.println(left + " + " + right + " = " + result);
    }
    public void minus (int num) {
        int left = num;
        int right = numberGenerater.generate(baseNum);
        int result = left - right;
        System.out.println(left + " - " + right + " = " + result);
    }
    public void multiple (int num) {
        int left = num;
        int right = numberGenerater.generate(baseNum);
        int result = left * right;
        System.out.println(left + " x " + right + " = " + result);
    }


}
