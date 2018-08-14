package lt.baltictalents.zmogus;

import java.util.Arrays;

public class ZmogusMain {

    public static void main(String[] args) {
        Zmogus[] zmones = {new Zmogus("V1"), new Zmogus("V2")};

        Zmogus[] zmones2 = new Zmogus[3];
        System.out.println(Arrays.toString(zmones2));
        Zmogus zm = new Zmogus("X1");
        zmones2[0] = zm;
        System.out.println(Arrays.toString(zmones2));
        zmones2[1] = new Zmogus("X2");
        zmones2[0] = null;
        zmones2[2] = zm;
        System.out.println(Arrays.toString(zmones2));
    }
}

class Zmogus {
    String vardas;

    Zmogus(String vardas) {
        this.vardas = vardas;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    @Override
    public String toString() {
        return "Zmogus[vardas=" + vardas + "]";
    }
}
