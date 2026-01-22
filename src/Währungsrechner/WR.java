package Währungsrechner;

public abstract class WR implements IUmrechnen{
    public abstract double umrechnen(String variante, double betrag);
}
