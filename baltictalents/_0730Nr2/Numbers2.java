package lt.baltictalents._0730Nr2;
// Susumuoti paskutinius (didžiausius) tris skaičius iš intervalo [1; 100].
public class Numbers2 {
    public static void main(String[] args){
        int count = 0; int total = 0;
        System.out.print("Paskutiniu skaiciu: ");
        for (int i = 100; i >= 1; i--){
            if (count == 3){
                break;
            }
            count++;
            total += i;
//            if(true){continue;}
            System.out.print(i + " ");
        }
        System.out.print("suma yra " + total);
    }
}
