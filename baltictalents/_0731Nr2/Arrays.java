package lt.baltictalents._0731Nr2;

public class Arrays {

    public static void main(String[] args){
        int[] a = {5, 6, 10, 15, 8, 4};
        int[] b = {8, 5, 3};
        int totalA = 0;
        int totalB = 0;
        for(int i=0; i<a.length; i++){
            totalA = totalA + a[i];
        }
        int averA = totalA / a.length;

        System.out.println("a array average is : " + averA);

        for(int i=0; i<b.length; i++){
            totalB = totalB + b[i];
        }
        int averB = totalB / b.length;

        System.out.println("b array average is : " + averB);

        int diff = averA - averB;

        System.out.println("Difference : " + diff);
    }
}
