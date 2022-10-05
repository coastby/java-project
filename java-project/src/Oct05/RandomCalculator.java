package Oct05;

/**
 * param : int a
 * a + random 정수 출력
 * randomNumber = 0~9
 * method :
 * plus, minus, multiple, divide
 *
 * zero divide : "랜덤하게 생성된 숫자가 0입니다."
 * */

public class RandomCalculator implements Calculratable{
    private int a;
    private int randomNumber;

    public RandomCalculator(int a) {
        this.a = a;
        this.randomNumber = (int) (Math.random()*10);
    }
    @Override
    public void plus() {
        System.out.println(a+randomNumber);
    }
    @Override
    public void minus() {
        System.out.println(a-randomNumber);
    }
    @Override
    public void multiple() {
        System.out.println(a*randomNumber);
    }
    @Override
    public void divide() {
        float result = (float) a / randomNumber;
        System.out.println(result);
    }

}