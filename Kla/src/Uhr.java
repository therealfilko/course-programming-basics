public class Uhr {
    public Uhr(int stunden, int minuten) {
        this.stunden = stunden;
        this.minuten = minuten;

        if (stunden > 23 || stunden < 0) {
            throw new IllegalArgumentException("Stunde oder Minute nicht im erlaubte Intervall");
        }
        if (minuten > 59 || minuten < 0) {
            throw new IllegalArgumentException("Stunde oder Minute nicht im erlaubte Intervall");
        }
    }
}
