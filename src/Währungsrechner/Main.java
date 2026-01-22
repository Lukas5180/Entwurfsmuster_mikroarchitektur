package Währungsrechner;

public class Main {
    public static void main(String[] args) {

        WR wr = new WREURO2Dollar();
        double d = wr.umrechnen("EURO2DOLLAR", 100);
        System.out.println("100 EUR in DOLLAR: " + d);
        System.out.println(WREURO2Dollar.KURS);

        WR wr2 = new WREURO2YEN();
        double d2 = wr2.umrechnen("EURO2YEN", 100);
        System.out.printf("100 EUR in Yen: " + d2);



    }
}
