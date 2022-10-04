package Oct04;

public class CurrencyCount {
    public static void main(String[] args) {
        int currency50000 = 50000;
        int currency10000 = 10000;
        int currency5000 = 5000;
        int currency1000 = 1000;
        int currency500 = 500;

        int refund = 25000;

        //필요한 화폐 매수 및 나머지 돈 출력
        System.out.printf("50000원? %d장 나머지 : %d\n", refund/currency50000, refund%currency50000);
        refund %= 50000;
        System.out.printf("10000원? %d장 나머지 : %d\n", refund/currency10000, refund%currency10000);
        refund %= 10000;
        System.out.printf("5000원? %d장 나머지 : %d\n", refund/currency5000, refund%currency5000);
        refund %= 5000;
        System.out.printf("1000원? %d장 나머지 : %d\n", refund/currency1000, refund%currency1000);
        refund %= 1000;
        System.out.printf("500원? %d장 나머지 : %d\n", refund/currency500, refund%currency500);
        refund %= 500;
        System.out.printf("100원? %d장 나머지 : %d\n", refund/100, refund%100);
        refund %= 100;
        System.out.printf("50원? %d장 나머지 : %d\n", refund/50, refund%50);
        refund %= 50;
        System.out.printf("10원? %d장 나머지 : %d\n", refund/10, refund%10);

    }
}
