package dolikissjgabi20190114;

import java.io.*;

public class DoliKissJGabi20190114 {

    private static final int N = 32;
    private static int t[] = new int[N];
    private static RandomAccessFile f;

    private static void f00(int hossz, char jel, String name) {
        System.out.print(name);
        for (int ii = 0; ii < hossz; ii++) {
            System.out.print(jel);
        }
        System.out.println("");
    }

    private static void f0(String inputfile) {
        try {
            f = new RandomAccessFile(inputfile, "r");
            for (int ii = 0; ii < N; ii++) {
                t[ii] = Integer.parseInt(f.readLine());
            }
            f.close();
        } catch (IOException e) {
            System.out.println("HIBA: " + e.getMessage());
        }
    }

    private static void f1() {
        f00(60, '-', "(A)");

        for (int ii = 0; ii < N; ii++) {
            System.out.print(t[ii] + " ");
        }
        System.out.println("");
    }

    private static void f2() {
        int db = 0;
        f00(60, '-', "(B)");

        for (int ii = 0; ii < N; ii++) {
            if (t[ii] % 2 == 0) {
                System.out.print(t[ii] + " ");
                db++;
            }
        }
        System.out.println("");
        System.out.println("Páros számok: " + db + " db");
    }

    private static void f3() {
        f00(60, '-', "(C)");

        int szum = 0;
        for (int ii = 0; ii < N; ii++) {
            szum += t[ii];
        }
        System.out.println("A számok összege: " + szum);
    }

    public static void main(String[] args) {
        f0("adatok.txt");
        f1();
        f2();
        f3();
        f00(60, '-', "VÉGE ");
    }

}
