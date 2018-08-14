package lt.baltictalents.vat2;

import java.math.BigDecimal;

public class PrekeKainaPvm {
    private static int kiekis = 5;
    private static Stuff[] prekes = new Stuff[5];

    public static void main(String[] args) {
        for (int i = 0; i < kiekis; i++) {
            prekes[i] = new Stuff(new BigDecimal(5 + i));
        }

        BigDecimal suma = BigDecimal.ZERO;
        for (int i = 0; i < prekes.length; i++) {
            suma = suma.add(prekes[i].getKaina());
        }

        pardavimoIrasas(kiekis, suma);
    }

    private static void pardavimoIrasas(int kiekis, BigDecimal sumaSuPvm) {
        for (int i = 0; i < kiekis; i++) {
            BigDecimal prekesPvm = prekes[i].getKaina().multiply(new BigDecimal("0.21")).setScale(2);
            System.out.println("Prekes kaina be PVM: " + prekes[i].getKaina().subtract(prekesPvm));
        }

        System.out.println("Prekiu kiekis: " + kiekis);
        BigDecimal sumosPvm = sumaSuPvm.multiply(new BigDecimal("0.21")).setScale(2);
        System.out.println("Suma be PVM: " + sumaSuPvm.subtract(sumosPvm));
        System.out.println("Suma su PVM: " + sumaSuPvm.setScale(2));
    }

}

