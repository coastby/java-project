package oct05.calculator;

public class RandomNumberGenerater implements NumberGenerater {
    //0이상 num 미만 랜덤 수 생성
    @Override
    public int generate(int num) {
        return (int) (Math.random()*num);
    }
}
