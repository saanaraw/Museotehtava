package fi.academy;

public class Museo {
    private String nimi;
    private String sijainti;
    private int perustusvuosi;

    public Museo(String nimi, String sijainti, int perustusvuosi) {
        this.nimi = nimi;
        this.sijainti = sijainti;
        this.perustusvuosi = perustusvuosi;
    }

    public String getNimi() {
        return nimi;
    }

    public String getSijainti() {
        return sijainti;
    }

    public int getPerustusvuosi() {
        return perustusvuosi;
    }

    @Override
    public String toString() {
        return this.nimi + ", " + this.sijainti + ", " + this.perustusvuosi;
    }
}
