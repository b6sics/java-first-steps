package ciklusok01;

import java.util.*;

public class Ciklusok01 {

    static Scanner sc = new Scanner(System.in);

    private static void f1() {
        System.out.println("");
        System.out.println("1. Az [1, 10] intervallum: ");
        for (int i = 1; i < 11; i++) {
            System.out.print(" " + i);
        }
        System.out.println("");
    }

    private static void f2() {
        System.out.println("");
        System.out.println("2. Tíz véletlenszám az [1, 50] intervallumból: ");
        for (int i = 0; i < 10; i++) {
            double rnd = Math.random() * 50 + 1;
            System.out.print(" " + (int) rnd);
        }
        System.out.println("");
    }

    private static void f3() {
        System.out.println("");
        System.out.println("3. Az első N<20 négyzetszám: ");
        System.out.print(" N = ");
        int N = sc.nextInt();
        for (int i = 1; i < N + 1; i++) {
            System.out.print(" " + i * i);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        f1();
        f2();
        f3();
    }
}
