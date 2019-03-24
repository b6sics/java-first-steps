package ioprog01;

import java.io.*;

public class IOProg01 {

    private static final int N = 28;
    private static String[] nevek = new String[N];
    private static RandomAccessFile f;

    private static void f0(String inputfile) {
        try {
            f = new RandomAccessFile(inputfile, "r");
            for (int ii = 0; ii < N; ii++) {
                nevek[ii] = f.readLine();
            }
            f.close();
        } catch (IOException e) {
            System.out.println("HIBA: " + e.getMessage());
        }
    }

    private static void f1() {
        for (int ii = 0; ii < N; ii++) {
            System.out.println(nevek[ii]);
        }
    }

    public static void main(String[] args) {
        f0("adatok.txt");
        f1();
    }

}
