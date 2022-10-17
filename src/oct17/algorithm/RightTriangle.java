package oct17.algorithm;

public class RightTriangle {
    public void makeRightTriangle (int n) {
        for (int i = 0; i < n; i++) {
            for (int j= 0; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.makeRightTriangle(10);
    }
}
