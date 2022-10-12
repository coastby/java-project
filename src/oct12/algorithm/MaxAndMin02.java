package oct12.algorithm;

interface Compare {
    boolean doSomething (int valueA, int valueB);
}

public class MaxAndMin02 {

    private int getMaxOrMin(int[] arr, Compare compare) {
        int targetVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            boolean isSth = compare.doSomething(arr[i],targetVal);
            if (isSth) {
                targetVal = arr[i];
            }
        }
        return targetVal;
    }

    public int max(int[] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA > valueB;
            }
        });
    }

    public int min (int[] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA < valueB;
            }
        });
    }


    public static void main(String[] args) {
        int[] arr = {3, 29, 38, 12, 57, 74, 40, 85, 61};
        MaxAndMin02 m1 = new MaxAndMin02();
        int result = m1.max(arr);
        if (result == 85) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
