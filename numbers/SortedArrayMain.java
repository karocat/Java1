package lt.baltictalents.numbers;

import java.util.Arrays;

public class SortedArrayMain {
    public static void main(String[] args) {
        int[] array = {-10, 0, 2, 9, -5};
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
        int k;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}