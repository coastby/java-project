package oct17.algorithm;

public class RightTriangle {
    char letter;
    public RightTriangle() {
        this.letter = '#';
    }
    public RightTriangle(char letter) {
        this.letter = letter;
    }

    public void makeRightTriangle (int n) {
        for (int i = 0; i < n; i++) {
            for (int j= 0; j <= i; j++)
                System.out.printf("%c ", letter);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        RightTriangle rightTriangle = new RightTriangle('d');
        rightTriangle.makeRightTriangle(10);
    }
}
