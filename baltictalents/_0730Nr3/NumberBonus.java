package lt.baltictalents._0730Nr3;

import java.util.ArrayList;

public class NumberBonus {
    public static void main(String[] args){
        int sum = 0;
        int[] arr1 = new int[] {1, 2, 3};
        int[] arr2 = new int[] {4, 5, 6};
        ArrayList<Integer> arr3 = new ArrayList<>(arr1.length + arr2.length);
        if (arr1.length != 0 || arr2.length != 0) {
            for (int i : arr1) {
                arr3.add(i);
            }
            for (int j : arr2) {
                arr3.add(j);
            }
            System.out.println("Elements: " + arr3);
            for (int k : arr3) {
                sum += k;
            }
            System.out.print("Sum is " + sum);
        }
    }
}
