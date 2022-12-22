public class Main {
    public static void main(String[] args) {
        Girokonto hanskonto;
        Girokonto ottokonto;
        hanskonto = new Girokonto("Hans");
        ottokonto = new Girokonto("Otto");
        double hansStand;
        long hansNr;
        hansStand = hansKonto.getKontostand();
        hansNr = hansKonto.getKontonummer();

        System.out.println("Hans hat im Moment " + hansStand
                + " EUR auf dem Konto mit der Nummer " + hansNr);
        boolean hatGeklappt;
        hatGeklappt = ottosKonto.abheben(200);
        if (hatGeklappt == true) {
            System.out.println("Die Abhebung war erfolgreich!");
            double ottosStand;
            ottosStand = ottosKonto.getKontostand();
            System.out.println("Neuer Kontostand bei Otto: " + ottosStand);
            hansKonto.einzahlen(200);
        }
        System.out.println("Alle Daten von Hans: " + hansKonto);
    }
}
