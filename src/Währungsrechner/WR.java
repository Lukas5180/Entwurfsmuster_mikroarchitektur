package Währungsrechner;

public abstract class WR implements IUmrechnen{
    @Override
    public double umrechnen(String variante, double betrag) {
        if (zustaendig(variante)) {
            return getFaktor() * betrag;
        } else {
            throw new IllegalArgumentException("Variante " + variante + " nicht zusändig");
        }
    }
}
