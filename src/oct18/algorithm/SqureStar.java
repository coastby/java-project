package oct18.algorithm;

public class SqureStar {
    public void printSqure (int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("*".repeat(size)+"\n");
        }
    }

    public static void main(String[] args) {
        int size = 10;
        SqureStar ss = new SqureStar();
        ss.printSqure(size);
    }
}
