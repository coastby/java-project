package oct18.algorithm;

public class SqureStar {
    String letter;
    public SqureStar() {
        this.letter = "*";
    }
    public SqureStar(String letter) {
        this.letter = letter;
    }

    public void printSqure (int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(letter.repeat(size)+"\n");
        }
    }

    public void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(letter.repeat(width)+"\n");
        }
    }

    public static void main(String[] args) {
        int size = 10;
        SqureStar ss = new SqureStar();
        SqureStar sss = new SqureStar("s");
        ss.printSqure(size);
        System.out.println();
        sss.printRectangle(5, 3);
    }
}
