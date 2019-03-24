package outputformat2;

import java.util.*;

public class OutputFormat2 {

    private static void vonalathuz(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
        System.out.println("");
    }

    private static int rnd(int ah, int fh) {
        int range = (fh - ah) + 1;
        return (int) (Math.random() * range) + ah;
    }

    private static void csere(int a, int b) {
        int c;
        if (a > b) {
            c = a;
            a = b;
            b = c;
        }
        System.out.println(a + " " + b);
    }

    private static void rendezesABC() {
        for (int i = 0; i < 10; i++) {
            csere(rnd(1, 10), rnd(1, 10));
        }
    }

    private static double t(int a, int ma) {
        return ((double) a) * ma / 2;
    }

    private static void triangle(int a, int ma) {
        System.out.println("A háromszög");
        System.out.println("             alapja   : " + a);
        System.out.println("             magassága: " + ma);
        System.out.println("             területe : " + t(a, ma));
    }

    public static void main(String[] args) {
        vonalathuz(8, '*');
        rendezesABC();
        vonalathuz(8, '*');
        triangle(2, 3);
        vonalathuz(20, '-');
    }
}
