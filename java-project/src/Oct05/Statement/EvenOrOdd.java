package Oct05.Statement;

public class EvenOrOdd {
    private int input;
    private StatementMaker statementMaker;

    public EvenOrOdd(int input, StatementMaker statementMaker) {
        this.input = input;
        this.statementMaker = statementMaker;
    }

    public void run() {
        int num = input;
        if (num%2 == 0) {
            statementMaker.evenPrint();
        } else {
            statementMaker.oddPrint();
        }
    }

}
