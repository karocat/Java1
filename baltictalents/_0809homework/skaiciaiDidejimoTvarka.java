package lt.baltictalents._0809homework;

import java.util.Arrays;

public class skaiciaiDidejimoTvarka {
    public static void main(String[] args) {
        int[] array = {-10, 0, 2, 9, -5};
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
        int k;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    k = array[i];
                    array[i] = array[j];
                    array[j] = k;

                    }
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }


/*import java.util.*;

class SortedArrayAndList {
    public static void main(String[] args) {
        int[] arr = {-10, 0, 2, 9, -5};
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));

        List<Integer> arrList = new ArrayList<>();
        for (int i : arr) {
            arrList.add(i);
        }
        // surikiuojam atsitiktine tvarka, nes pries tai masyvas buvo surikiuotas didejimo tvarka
        Collections.shuffle(arrList);
        System.out.println("List before sorting: " + arrList);
        Collections.sort(arrList, Comparator.reverseOrder());
        System.out.println("List after sorting: " + arrList);
    }
}

*/