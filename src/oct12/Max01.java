package oct12;

public class Max01 {
    public int getMax(int[] arr) {
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxVal = (arr[i] > maxVal)? arr[i] : maxVal;
        }
        return maxVal;
    }

    public static void main(String[] args) {
        int[] arr = {3, 29, 38, 12, 57, 74, 40, 85, 61};
        Max01 m1 = new Max01();
        int result = m1.getMax(arr);
        if (result == 85) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
