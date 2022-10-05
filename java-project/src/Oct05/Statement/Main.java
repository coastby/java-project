package Oct05.Statement;

public class Main {
    public static void main(String[] args) {
        StatementMaker kStatementMaker = new KoreanStatementMaker();
        EvenOrOdd k = new EvenOrOdd(10, kStatementMaker);
        k.run();

        StatementMaker eStatementMaker = new EnglishStatementMaker();
        EvenOrOdd e = new EvenOrOdd(10, eStatementMaker);
        e.run();
    }
}
