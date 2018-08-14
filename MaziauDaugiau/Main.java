package lt.baltictalents.MaziauDaugiau;

public class Main {

    public static void main(String[] args) {
        int a = 100;
        String rez = "a yra " + (a < 100 ? "maziau" : "daugiau") + " uz simta ";

        String status;
        if (a < 100) {
            status = "mažiau";
        } else {
            status = "daugiau";
        }
        rez = "a yra " + status + " už šimtą ";

        System.out.println();
    }
}
