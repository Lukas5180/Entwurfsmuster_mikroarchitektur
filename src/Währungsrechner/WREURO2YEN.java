package Währungsrechner;

public class WREURO2YEN extends WR {

    public static final double KURS = 185.57;
    public static final String VARIANTE = "EURO2YEN";

    @Override
    public double getFaktor() {
        return KURS;
    }

    @Override
    public boolean zustaendig(String variante) {
        return VARIANTE.equalsIgnoreCase(variante);
    }
}
