package oct18.algorithm;

public class SqureStar {
    public void printSqure (int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("*".repeat(size)+"\n");
        }
    }

    public void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            System.out.print("*".repeat(width)+"\n");
        }
    }

    public static void main(String[] args) {
        int size = 10;
        SqureStar ss = new SqureStar();
        ss.printSqure(size);
        System.out.println();
        ss.printRectangle(5, 3);
    }
}
