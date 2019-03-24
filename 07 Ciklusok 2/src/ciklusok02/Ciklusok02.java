package ciklusok02;

import java.util.*;

public class Ciklusok02 {

    static Scanner sc = new Scanner(System.in);

    private static void f1() {
        System.out.println("");
        System.out.println("1. Az [1, 10] számai");

        int quantity = 10;

        for (int ii = 1; ii <= quantity; ii++) {
            System.out.print(ii);
            if (ii < quantity) {
                System.out.print(", ");
            } else {
                //System.out.print(".");
            }
        }
        System.out.println("");
    }

    private static void f2() {
        System.out.println("");
        System.out.println("2. Az rnd [1, 50] számai");

        int quantity = 10;
        int max = 50;
        int min = 1;

        for (int ii = 0; ii < quantity; ii++) {
            double rnd = Math.random() * max + min;
            System.out.print((int) (rnd));
            if (ii < quantity - 1) {
                System.out.print(", ");
            } else {
                //System.out.print(".");
            }
        }
        System.out.println("");
    }

    private static void f3() {
        System.out.println("");
        System.out.println("3. Négyzetszámok");

        String ask = "N (<30)= ";
        System.out.print(ask);
        int N = sc.nextInt();

        for (int ii = 1; ii <= N; ii++) {
            System.out.print(ii * ii);
            if (ii < N) {
                System.out.print(", ");
            } else {
                //System.out.print(".");
            }
        }
        System.out.println("");
    }

    private static void f4() {
        System.out.println("");
        System.out.println("4. Páratlan számok");

        String ask = "N (<30)= ";
        System.out.print(ask);
        int N = sc.nextInt();

        for (int ii = 1; ii <= N; ii = ii + 2) {
            System.out.print(ii);
            if (ii < N) {
                System.out.print(", ");
            } else {
                //System.out.print(".");
            }
        }
        System.out.println("");
    }

    private static void f5() {
        System.out.println("");
        System.out.println("5. [a,b] elemek");

        String ask1 = "A= ";
        String ask2 = "B= ";
        System.out.print(ask1);
        int a = sc.nextInt();
        System.out.print(ask2);
        int b = sc.nextInt();

        if (a > b) {
            int dummy = a;
            a = b;
            b = dummy;
        }

        for (int ii = a; ii < b; ii++) {
            System.out.print(ii + ", ");
        }
        System.out.print(b);
        System.out.println("");
    }

    public static void main(String[] args) {
        f1();
        f2();
        f3();
        f4();
        f5();
    }

}
