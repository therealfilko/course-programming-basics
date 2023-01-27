import java.lang.reflect.Array;

public class Monat {
    public Monat(int n, int m) {

    }
   public static int schleifeMitFor() {
        int[] zahlen = {5,2,7,0,3,9,10,4};
        int sum = 0;
        for(int i = 0; i < zahlen.length; i++) {
            if(zahlen[i] > 0) {
                sum += zahlen[i];
            }
        }
        return sum;
    }


    /**
     * Erzeugt ein Array mit gegebener Länge, füllt es mit
     * Vielfachen einer gegebenen Zahl und gibt das Array
     * zurück
     * Es wird angenommen, dass die Länge größer als 0 ist.
     * Z.B. liefert der Aufruf multipleVon2(5, 2) folgendes
     * Array zurück:
     * [0, 2, 4, 6, 8]
     * @param laenge des Arrays
     * @param z, eine ganze Zahl
     * @return Array mit den berechneten Vielfachen von z
     */

    public static int[] multipleVonZ(int laenge, int z) {
        int[] array = new int[laenge];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * z;
        }
        return array;
    }

    public static void getJahreszeitMitSwitch(String month) {
        switch(month) {
            case "januar":
            case "februar":
            case "maerz":
                System.out.println("Zieh dich warm an");
                break;
            case "april":
            case "mai":
            case "juni":
                System.out.println("Alles fängt an zu blühen");
                break;
            case "juli":
            case "august":
            case "september;":
                System.out.println("Badespaß garantiert");
                break;
            case "oktober":
            case "november":
            case "dezember":
                System.out.println("Stürmische Zeiten");
                break;
            default:
                System.out.println("Den Monat kenne ich nicht");
                break;
        }
    }
}
