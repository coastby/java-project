package Oct05.Statement;

public class EnglishStatementMaker implements StatementMaker{
    @Override
    public void evenPrint() {
        System.out.println("Even");
    }

    @Override
    public void oddPrint() {
        System.out.println("Odd");
    }
}
