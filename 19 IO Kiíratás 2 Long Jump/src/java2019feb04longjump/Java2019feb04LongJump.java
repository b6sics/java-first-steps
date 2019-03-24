package java2019feb04longjump;

import java.io.*;

public class Java2019feb04LongJump {

    private static RandomAccessFile f;
    private static final int N = 9;
    private static final int L = 9;
    private static String m[][] = new String[N][L];

    private static void f00(int hossz, char jel, String name) {
        System.out.print(jel + " |");
        System.out.print(name + "| ");
        for (int ii = name.length() - 5; ii < hossz; ii++) {
            System.out.print(jel);
        }
        System.out.println("");
    }

    // fájlkezelő metódusok
    private static void inputFile(String fileName, String mode) {
        try {
            f = new RandomAccessFile(fileName, mode);
            for (int ii = 0; ii < N; ii++) {
                String sor = f.readLine();
                m[ii] = sor.split(", "); //             
            }
            f.close();
            System.out.println("1. " + fileName + ".... beolvasva!");
        } catch (IOException e) {
            System.err.println("Fájl olvasási hiba: " + e.getMessage());
            System.exit(1);
        }
    }

    private static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
    }

    private static void appendFile(String fileName, String mode, String str) {
        File file = new File(fileName);
        long fileLength = file.length();
        try {
            f = new RandomAccessFile(fileName, mode);
            f.seek(fileLength);
            f.writeBytes(str + "\n");
            f.close();
        } catch (IOException e) {
            System.err.println("Fájl íráási hiba: : " + e.getMessage());
            System.exit(1);
        }
    }

    private static int legnagyobb(String t[]) {
        int jj = 3;
        while (t[jj].equals("x")) {
            jj++;
        }
        int maxIndex = jj;
        for (int ii = jj; ii < L; ii++) {
            if (!t[ii].equals("x")) {
                if (Integer.parseInt(t[ii]) > Integer.parseInt(t[maxIndex])) {
                    maxIndex = ii;
                }
            }
        }
        return Integer.parseInt(t[maxIndex]); // a legnagyobb ugrás helye
    }

    private static void f2(String label, String fileName, String mode) {
        System.out.print(label);
        deleteFile(fileName);
        for (int i = 0; i < N; i++) {
            String str = String.format("%15s%6s cm", m[i][0], m[i][2]);
            appendFile(fileName, mode, str);
        }
        System.out.println("A " + fileName + ".... kész!\n");
    }

    private static void f3(String label) {
        System.out.println(label);
        for (int i = 0; i < N; i++) {
            String str = String.format("%15s%6d cm", m[i][0], legnagyobb(m[i]));
            System.out.println(str);
        }
        System.out.println("");
    }

    private static void f4(String label, String fileName, String mode) {
        deleteFile(fileName);
        System.out.println(label);
        for (int ii = 0; ii < N - 1; ii++) {
            for (int jj = ii + 1; jj < N; jj++) {
                if (legnagyobb(m[ii]) < legnagyobb(m[jj])) {// a győztes megy előre
                    String[] t = m[ii];
                    m[ii] = m[jj];
                    m[jj] = t;
                }
            }
        }
        for (int ii = 0; ii < N; ii++) {
            String str = String.format("%15s%6s cm", m[ii][0], legnagyobb(m[ii]));
            System.out.println(str);
            appendFile(fileName, mode, str);
        }
        System.out.println("  A " + fileName + ".... kész!\n");
    }

    private static void f5(String label) {
        System.out.print(label);
        int szum = 0;
        for (int i = 0; i < N - 1; i++) {
            if (m[i][1].equals("Pécsi Kenguruk")) {
                szum += legnagyobb(m[i]);
            }
        }
        String str = szum + " pont";
        System.out.println(str);
        System.out.println("");
    }

    private static void f6(String label, String fileName, String mode) {
        System.out.println(label);
        for (int ii = 0; ii < N - 1; ii++) {
            int hozott = Integer.parseInt(m[ii][2]);
            int szerzett = legnagyobb(m[ii]);
            if (hozott < szerzett) {
                String str = String.format("%15s", m[ii][0]);
                //System.out.println(str); //képernyőre
                appendFile(fileName, mode, str);
            }
        }
        System.out.println("  A " + fileName + "... kész\n");
    }

    public static void main(String[] args) {
        f00(60, '*', "START JAVA 2019feb04 Long jump");
        inputFile("txt/longjump.txt", "r");
        f2("2. ", "txt/csucsok.txt", "rw");
        f3("3. A veresnyző neve és legnagyobb ugrása");
        f4("4. Az elért legjobb eredmény szerinti csökkenő sorrend", "txt/rangsor.txt", "rw");
        //HF
        f5("5. A Pécsi Kenguruk pontszáma: ");
        f6("6. Egyéni csúcsot ugrottak", "txt/ujCsucs.txt", "rw");
        f00(60, '*', "END JAVA 2019feb04 Long Jump");
    }

}
