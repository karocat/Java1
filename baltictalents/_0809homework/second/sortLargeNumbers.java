package lt.baltictalents._0809homework.second;

import java.util.Arrays;

class main {

    static void sortLargeNumbers(String arr[]) {

        Arrays.sort(arr, (left, right) ->
        {

            if (left.length() != right.length())
                return left.length() - right.length();
            return left.compareTo(right);
        });
    }


    public static void main(String args[]) {
        String arr[] = {"-10", "0", "2", "9", "-5"};
        sortLargeNumbers(arr);
        for (String s : arr)
            System.out.print(s + " ");
    }
}