package Währungsrechner;

public class WREURO2Dollar extends WR {

    public static final double KURS = 1.17;
    public static final String VARIANTE = "EURO2DOLLAR";

    @Override
    public double getFaktor() {
        return KURS;
    }

    @Override
    public boolean zustaendig(String variante) {
        return VARIANTE.equalsIgnoreCase(variante); //mit VARIANTE.equalsIgnoreCase(variante) wird automatisch geprüft ob variante null ist
    }
}
