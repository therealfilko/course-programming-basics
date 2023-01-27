import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {
        double[][] gewinn = new double[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                gewinn[i][j] = (i + 1) * (j + 1);
            }

        }

        for (double[] zeile : gewinn) {
           System.out.println(Arrays.toString(zeile)); 
        }

    }

}
