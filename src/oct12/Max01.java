package oct12;

public class Max01 {
    /**
     * param  : int[] arr
     * return : int[] [최대값인덱스, 최대값]
     */
    public int[] getMax(int[] arr) {
        int maxIdx = 0;
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                maxIdx = i;
            }
        }
        return new int[] {maxIdx, maxVal};
    }

    public static void main(String[] args) {
        int[] arr = {3, 29, 38, 12, 57, 74, 40, 85, 61};
        Max01 m1 = new Max01();
        int[] result = m1.getMax(arr);
        if (result[1] == 85 && result[0] == 7) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail" + result[0]);
        }
    }
}
