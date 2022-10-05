package Oct05.Statement;

public class KoreanStatementMaker implements StatementMaker{
    @Override
    public void evenPrint() {
        System.out.println("짝수");
    }

    @Override
    public void oddPrint() {
        System.out.println("홀수");
    }
}
