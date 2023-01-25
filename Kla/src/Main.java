public class Main {
    public static void main(String[] args) {
        Girokonto hansKonto;
        Girokonto ottosKonto;

        hansKonto = new Girokonto();
        ottosKonto = new Girokonto();

        String hansStand;
        hansKonto.setInhaber("Hans");
        hansStand = hansKonto.getStandFormatiert();
        long hansNr;
        hansNr = hansKonto.getKontonummer();

        String ottoStand;
        ottosKonto.setInhaber("Otto");
        ottoStand = ottosKonto.getStandFormatiert();
        long ottoNr;
        ottoNr = ottosKonto.getKontonummer();

        boolean hatGeklappt;
        ottosKonto.einzahlen(400);
        hatGeklappt = ottosKonto.abheben(200);
        if (hatGeklappt == true) {
            System.out.println("Die Abhebung war erfolgreich!");
            double ottosStand;
            ottosStand = ottosKonto.getKontostand();
            System.out.println("Neuer Kontostand bei Otto: " + ottosStand);
            hansKonto.einzahlen(200);
        }

        System.out.println(hansKonto.getInhaber() + " hat im moment " + hansStand + " eur auf dem konto mit der nummer " + hansNr);
        System.out.println(ottosKonto.getInhaber() + " hat im moment " + ottoStand + " eur auf dem konto mit der nummer " + ottoNr);

    }
}
