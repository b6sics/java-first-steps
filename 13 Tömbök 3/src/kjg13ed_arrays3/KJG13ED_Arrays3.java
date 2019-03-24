package kjg13ed_arrays3;

public class KJG13ED_Arrays3 {

    private static final int[] ADATOK = new int[]{4, 18, 11, 9,
        -2, -17, 15, 14, -7, -6, 5, 20, -17, 7, 16};
    private static final int N = ADATOK.length;

    private static void f1() {
        System.out.println("\n 1. feladat");
        for (int ii = 0; ii < N; ii++) {
            if (ADATOK[ii] < 0) {
                System.out.print(
                        String.format("%6d", ADATOK[ii])
                );
            }
        }
        System.out.println("");
    }

    private static void f2() {
        System.out.println("\n 2. feladat");
        int sz = 0;
        for (int ii = 0; ii < N; ii++) {
            if (ADATOK[ii] > 0 && ADATOK[ii] % 2 == 0) {
                sz += ADATOK[ii];
                System.out.print(
                        String.format("%6d", ADATOK[ii])
                );
            }
        }
        System.out.println("");
        System.out.print("\tA pozitív páros számok összege: ");
        System.out.println(sz);
    }

    private static void f3() {
        System.out.println("\n 3. feladat");
        int sz = 0, jj = 0;
        for (int ii = 0; ii < N-1; ii++) {
            if (ADATOK[ii] < ADATOK[ii + 1]) {
                sz += ADATOK[ii];
                jj++;
                System.out.print(
                        String.format("%6d", ADATOK[ii])
                );
            }
        }
        System.out.println("");
        System.out.print("\tA számok átlaga: ");
        System.out.println(
                String.format("%6.2f", (double) sz / jj)
        );
    }

    public static void main(String[] args) {
        f1();
        f2();
        f3();
    }

}
