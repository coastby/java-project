package oct17.algorithm;

public class Pyramid {
    public void printStar1(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = (4 - i); k > 0; k--) {
                System.out.print(" ");
            }
            //별찍기
            for (int j = 0; (j < 2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printStar2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i+1; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
      Pyramid p = new Pyramid();
      p.printStar1(5);
      p.printStar2(5);
    }

}
