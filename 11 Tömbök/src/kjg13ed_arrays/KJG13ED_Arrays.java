package kjg13ed_arrays;

import java.util.*;

public class KJG13ED_Arrays {

    static Scanner sc = new Scanner(System.in);

    private static void f1() {
        int[] t = {1, 23, 7, 0, -2, -45};
        int n = t.length;
        int szum = 0;
        for (int ii = 0; ii < n - 1; ii++) {
            System.out.print(t[ii]);
            szum += t[ii];
            System.out.print(", ");
        }
        System.out.println(t[n - 1]);
        szum += t[n - 1];

        for (int ii = n - 1; ii > 0; ii--) {
            System.out.print(t[ii]);
            System.out.print(", ");
        }
        System.out.println(t[0]);
        System.out.println("");
        System.out.print("a 't1' tömb összege: ");
        System.out.println(szum);
        System.out.println("");
    }

    private static void f2() {
        int[] t = {1, 23, 7, 0, -2, -45, 11, 123, 17, 110};
        int n = t.length;
        int szum = 0;
        for (int ii = 0;
                ii < n - 1; ii++) {
            System.out.print(5 * t[ii]);
            szum += t[ii];
            System.out.print(", ");
        }

        System.out.println(5 * t[n - 1]);
        szum += t[n - 1];

        for (int ii = n - 1;
                ii > 0; ii--) {
            System.out.print(5 * t[ii]);
            System.out.print(", ");
        }

        System.out.println(
                5 * t[0]);
        System.out.println(
                "");
        System.out.print(
                "a 't2' tömb összege: ");
        System.out.println(
                szum);
        System.out.print(
                "a 't2' tömb összegének az ötszöröse: ");
        System.out.println(
                5 * szum);
        System.out.println(
                "");
    }

    public static void main(String[] args) {
        f1();
        f2();
    }

}
