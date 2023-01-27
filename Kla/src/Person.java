public class Person{
    private String vorname;
    private String nachname;
    private String adresse;
    public Person(String vorname, String nachname,
                  String adresse){
        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
    }
    /**
     * gibt den Namen einer Person
     * bestehend aus Vor- und Nachname zurück
     *
     * @return name, String
     */
    public String getName(){
        return vorname + " " + nachname;
    }
    public String toString(){
        return this.getName() + "\n" + this.adresse;
    }
}