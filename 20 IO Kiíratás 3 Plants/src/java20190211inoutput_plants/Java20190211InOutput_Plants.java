package java20190211inoutput_plants;

import java.io.*;

/**
 *
 * KjG
 */
public class Java20190211InOutput_Plants {

    private static RandomAccessFile f;
    private static final int N = 18;
    private static final int L = 8;
    private static String plants[][] = new String[N][L];

    private static void f00(int hossz, char jel, String name) {
        System.out.print(jel + " |");
        System.out.print(name + "| ");
        for (int ii = name.length() - 5; ii < hossz; ii++) {
            System.out.print(jel);
        }
        System.out.println("");
    }
    // --- textdekoráció metódus vége

    private static void inputFile(String fileName, String mode) {
        try {
            f = new RandomAccessFile(fileName, mode);
            for (int ii = 0; ii < N; ii++) {
                String sor = f.readLine();
                plants[ii] = sor.split("\t");
            }
            f.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
        System.out.println("1. A " + fileName + "... beolvasva\n");
    }

    private static void appendFile(String fileName, String mode, String str) {
        try {
            f = new RandomAccessFile(fileName, mode);
            f.seek(f.length());
            f.writeBytes(str + "\n");
            f.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

    private static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
    }
    // --- fájlkezelő metódusok vége

    private static void rendez() {
        for (int ii = 0; ii < N - 1; ii++) {
            for (int jj = ii + 1; jj < N; jj++) {
                if (plants[ii][0].compareTo(plants[jj][0]) > 0) {
                    String[] dummy = plants[ii];
                    plants[ii] = plants[jj];
                    plants[jj] = dummy;
                }
            }
        }
        System.out.println("ABC sorrendbe rendezés kész!\n");
    }

    private static int atlag(String[] t) {
        int atlag = 0;
        for (int ii = 1; ii < t.length; ii++) {
            atlag += Integer.parseInt(t[ii]);
        }
        return atlag / (t.length - 1);
    }

    private static int maximum(String t[]) {
        int max = 0;
        for (int ii = 1; ii < t.length - 1; ii++) {
            if (max < Integer.parseInt(t[ii])) {
                max = Integer.parseInt(t[ii]);
            }
        }
        return max;
    }

    private static void f1(String label, String fileName, String mode) {
        f00(60, '-', label);
        deleteFile(fileName);
        for (int ii = 0; ii < N; ii++) {
            String str = String.format("%21s", plants[ii][0]);
            appendFile(fileName, mode, str);
        }
        System.out.println("A " + fileName + ".... kész!\n");
    }

    private static void f2(String label, String fileName, String mode) {
        f00(60, '-', label);
        deleteFile(fileName);
        for (int ii = 0; ii < N; ii++) {
            int a = atlag(plants[ii]);
            if (a > 100000) {
                String str = String.format("%21s\t%8d", plants[ii][0], a);
                appendFile(fileName, mode, str);
            }
        }
        System.out.println("A " + fileName + ".... kész!\n");
    }

    private static void f3(String label, String fileName, String mode) {
        f00(60, '-', label);
        deleteFile(fileName);
        for (int ii = 0; ii < N; ii++) {
            int i2012 = Integer.parseInt(plants[ii][1]);
            int i2018 = Integer.parseInt(plants[ii][7]);
            if (i2012 > i2018) {
                int div = i2018 - i2012;
                String str = String.format("%21s\t%8d", plants[ii][0], div);
                appendFile(fileName, mode, str);
            }
        }
        System.out.println("A " + fileName + ".... kész!\n");
    }

    private static void hf1(String label, String fileName, String mode) {
        f00(60, '-', label);
        deleteFile(fileName);
        String str;
        str = String.format("%21s\t%8s\t%8s", "Növény neve:", "2014:", "2018:");
        appendFile(fileName, mode, str);
        for (int ii = 0; ii < N; ii++) {
            int i2014 = Integer.parseInt(plants[ii][3]);
            int i2018 = Integer.parseInt(plants[ii][7]);
            if (4 * i2014 <= i2018) {
                str = String.format("%21s\t%8d\t%8d", plants[ii][0], i2014, i2018);
                appendFile(fileName, mode, str);
            }
        }
        System.out.println("A " + fileName + ".... kész!\n");
    }

    private static void hf2(String label, String fileName, String mode) {
        f00(60, '-', label);
        deleteFile(fileName);
        String str;
        str = String.format("%21s\t%8s", "Növény neve:", "maximum:");
        appendFile(fileName, mode, str);
        for (int ii = 0; ii < N; ii++) {
            str = String.format("%21s\t%8d", plants[ii][0], maximum(plants[ii]));
            appendFile(fileName, mode, str);
        }
        System.out.println("A " + fileName + ".... kész!\n");
    }

    public static void main(String[] args) {
        f00(60, '*', "START - Java20190211InOutput_Plants");
        inputFile("txt/adatok.txt", "r");
        rendez();
        f1("1. A növények neve szerint A-Z sorrend: ", "txt/f1.txt", "rw");
        f2("2. Az import átlag nagyobb 100000 tőnél: ", "txt/f2.txt", "rw");
        f3("3. 2018-ban csökkent az import 2012-höz képest: ", "txt/f3.txt", "rw");
        //HF---
        hf1("HF1. A 2018-as mennyiség legalább négyszerese az 2014-esnek: ", "txt/hf1.txt", "rw");
        hf2("HF2. A legnagyobb importált mennyiség növényenként: ", "txt/hf2.txt", "rw");
        f00(60, '*', "END - Java20190211InOutput_Plants");
    }
}
