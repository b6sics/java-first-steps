package kjg13ed_arrays2;

public class KJG13ED_Arrays2 {

    private static final int N = 10;
    private static int[] t = new int[N];

    private static int rnd(int ah, int fh) {
        return (int) (Math.random() * (fh - ah + 1) + ah);
    }

    private static void upLoadArray() {
        for (int ii = 0; ii < N; ii++) {
            t[ii] = rnd(-20, 25);
        }
    }

    private static void tablazatosKiiras() {
        System.out.println("\tTáblázatos kiírás");
        for (int ii = 0; ii < N; ii++) {
            System.out.println(
                    String.format("%11d %6d %6.2f",
                            t[ii], t[ii] * 3, ((double) t[ii] / 4 + 5)));
        }
    }

    private static void sorOsszegekkel() {
        System.out.println("\n\tTáblázatos kiírás sorösszegekkel");
        for (int ii = 0; ii < N; ii++) {
            double szum = t[ii] + 3 * t[ii] + ((double) t[ii] / 4);
            System.out.println(
                    String.format("%11d %6d %6.2f %12.2f",
                            t[ii], t[ii] * 3, ((double) t[ii] / 4 + 5), szum));
        }
    }

    public static void main(String[] args) {
        upLoadArray();
        tablazatosKiiras();
        sorOsszegekkel();
        System.out.println("");
    }

}
