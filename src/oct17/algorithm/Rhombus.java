package oct17.algorithm;

public class Rhombus {
    public void printRhombus (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i+1; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = n-2; i >= 0; i--) {
            for (int j = 0; j < n-1-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i+1; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
       int n = 10;
       Rhombus r = new Rhombus();
       r.printRhombus(n);
    }
}
