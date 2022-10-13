package oct13.algorithm;

import java.util.Arrays;

//버블정렬 : 자기 자리 기준 오른쪽에 있는 수들과 비교를 한다.
public class SelectionSort01 {
    public int[] selectionSort(int[] arr) {
        for (int i = 0; i < (arr.length-1); i++) {
            //더 작은 수를 넣을 변수
            int tmp;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectionSort01 bs = new SelectionSort01();
        int[] arr = {3, 36, 23, 5, 8};

        arr = bs.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
