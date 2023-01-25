import java.text.NumberFormat;
public class Girokonto {
    private long kontonummer;
    private double kontostand = 400;
    private String inhaber;

    public long getKontonummer() {
        return this.kontonummer;
    }

    public String getInhaber() {
        return this.inhaber;
    }
    public String getStandFormatiert() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        String ausgabetext = nf.format(this.kontostand);
        return ausgabetext;
    }

    public double getKontostand() {
        return this.kontostand;
    }

    public void setInhaber(String inhaber) {
        boolean inOrdnung = inhaber != null && !inhaber.equals("");
        if(inOrdnung == true) {
            this.inhaber = inhaber;
        }
    }

    public void einzahlen(double betrag) {
        if(betrag > 0) {
            this.kontostand = this.kontostand + betrag;
        }
    }

    public boolean abheben(double betrag) {
        boolean kontoGedeckt = this.kontostand >= betrag;
        if(betrag > 0 && kontoGedeckt) {
            this.kontostand = this.kontostand - betrag;
            return true;
        }
        return false;
    }

    public double zinsenDazu(double zinssatzInProzent);

    public boolean ueberweisen(double betrag, Girokonto empfaenger);

}
