public class Kunde {
    private String vorname;
    private String nachname;
    private String adresse;

    public Kunde(String vorname, String nachname, String adresse){
        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
    }

    public String getVorname() {
        return vorname;
    }
}
