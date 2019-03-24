package javainoutput;

import java.io.*;

public class JavaInOutput {

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

    private static void inputFile(String fileName, String mode) {
        try {
            f = new RandomAccessFile(fileName, mode);
            for (int i = 0; i < N; i++) {
                String sor = f.readLine();
                m[i] = sor.split(";"); //             
            }
            f.close();
            System.out.println(fileName + " beolvasva!");
        } catch (IOException e) {
            System.err.println("Nem olvasható a(z): " + e.getMessage());
            System.exit(1);
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
            System.err.println("Nem írható a(z): " + e.getMessage());
            System.exit(1);
        }
    }

    private static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
    }

    private static void f1(String cimke, String fileName) {
        f00(60, '-', cimke);
        deleteFile(fileName);
        for (int ii = 0; ii < N; ii++) {
            if (m[ii][1].equals("L")) {
                String str = String.format("%20s", m[ii][0]);
                System.out.println(str);
                appendFile(fileName, "rw", str);
            }
        }
    }

    private static void f2(String cimke, String fileName) {
        f00(60, '-', cimke);
        deleteFile(fileName);
        for (int ii = 0; ii < N; ii++) {
            int avg = Integer.parseInt(m[ii][2]) + Integer.parseInt(m[ii][3]);
            if (m[ii][1].equals("F") && avg > 6) {
                String str = String.format("%20s", m[ii][0]);
                System.out.println(str);
                appendFile(fileName, "rw", str);
            }
        }
    }

    private static void f3(String cimke, String fileName) {
        f00(60, '-', cimke);
        deleteFile(fileName);
        for (int ii = 0; ii < N; ii++) {
            int angol = Integer.parseInt(m[ii][2]);
            if (m[ii][1].equals("F") && angol == 5) {
                String str = String.format("%20s", m[ii][0]);
                System.out.println(str);
                appendFile(fileName, "rw", str);
            }
        }
    }

    private static void f4(String cimke, String fileName) {
        f00(60, '-', cimke);
        deleteFile(fileName);

        int nemet = 0;
        String name = "Zala Pali";
        for (int ii = 0; ii < N; ii++) {
            if (m[ii][0].equals(name)) {
                nemet = Integer.parseInt(m[ii][2]);
                String str = m[ii][0] + " német: " + m[ii][3];
                f00(60, '-', str);
                break;
            }
        }
        for (int ii = 0; ii < N; ii++) {
            int parse = Integer.parseInt(m[ii][3]);
            String actualName = m[ii][0];
            if (nemet == parse && !actualName.equals(name)) {
                String str = String.format("%20s", m[ii][0]);
                System.out.println(str);
                appendFile(fileName, "rw", str);
            }
        }
    }

    public static void main(String[] args) {
        f00(60, '*', "START JAVA Input Output ");
        inputFile("12C.txt", "r");
        f1("LÁNYOK ", "lanyok.txt");
        f2("3-as ÁTLAG FELETTI FIÚK ", "fiuk.txt");
        f3("5-ős ANGOL FIÚK ", "fiukAngolJeles.txt");
        f4("Akinek német jegye == Zala Pali ", "mintZalaPali.txt");
        f00(60, '*', "END JAVA Input Output ");
    }

}
