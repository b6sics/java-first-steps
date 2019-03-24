package javarecords;

import java.io.*;

/**
 *
 * @author KjG
 */
public class JavaRecords {

    private static final int N = 37;
    private static final int L = 4;
    private static String m[][] = new String[N][L];
    private static RandomAccessFile f;

    private static void f00(int hossz, char jel, String name) {
        System.out.print(name);
        for (int ii = name.length(); ii < hossz; ii++) {
            System.out.print(jel);
        }
        System.out.println("");
    }

    private static void f0(String inputfile, String mode) {
        try {
            f = new RandomAccessFile(inputfile, mode);
            for (int ii = 0; ii < N; ii++) {
                String sor = f.readLine();
                m[ii] = sor.split("\t");
            }
            f.close();
        } catch (IOException e) {
            System.err.println("HIBA: " + e.getMessage());
            System.exit(1);
        }
    }

    private static void f1(String cimke) {
        f00(60, '-', cimke);

        for (int ii = 0; ii < N; ii++) {
            int tm = Integer.parseInt(m[ii][2]);
            if (m[ii][1].equals("L") && tm > 170) {
                String str = String.format("%15s%5d cm", m[ii][0], tm);
                System.out.println(str);
            }
        }
        System.out.println("");
    }

    private static void f2(String cimke) {
        int db = 0;
        f00(60, '-', cimke);

        for (int ii = 0; ii < N; ii++) {
            if (m[ii][1].equals("F")) {
                db++;
            }
        }
        String str = String.format("%5d fő.", db);
        System.out.println(str);
        System.out.println("");
    }

    private static void f3(String cimke) {
        f00(60, '-', cimke);

        for (int ii = 0; ii < N; ii++) {
            double mag = Double.parseDouble(m[ii][2]);
            int suly = Integer.parseInt(m[ii][3]);
            String str = String.format("%20s%10.2f ", m[ii][0], (mag / 100 * suly));
            System.out.println(str);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        f00(60, '*', "START JAVA RECORDS ");
        f0("12C.txt", "r");
        f1("A 170 cm-nél magasabb lányok: ");
        f2("A fiúk létszáma: ");
        f3("Név és test tömeg index: ");
        f00(60, '*', "VÉGE JAVA RECORDS ");
    }

}
