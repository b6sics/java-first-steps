package outputformat;

import java.util.*;

public class OutputFormat {

    static Scanner sc = new Scanner(System.in);// tagváltozó minden metódus látja

    private static void fv1() {
        System.out.println("");// ver1
        System.out.println("1.feladat a");
        System.out.print(" a = ");
        int a = sc.nextInt();
        System.out.print(" b = ");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    private static void fv2() {
        System.out.println("");// ver2
        System.out.println("1.feladat b");
        System.out.print(" a = ");
        int a = sc.nextInt();
        System.out.print(" b = ");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (i < b) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println("");
    }

    private static void fv3() {
        System.out.println("");// ver3
        System.out.println("1.feladat c");
        System.out.print(" a = ");
        int a = sc.nextInt();
        System.out.print(" b = ");
        int b = sc.nextInt();
        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }
        for (int i = a; i <= b; i++) {
            if (i < b) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println("");
    }

    private static void f2() {
        System.out.println("");
        System.out.println("2.feladat");
        System.out.print(" a = ");
        int a = sc.nextInt();
        System.out.print(" b = ");
        int b = sc.nextInt();
        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }
        for (int i = b; i >= a; i--) {
            if (i > a) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println("");
    }

    private static void f3() {
        System.out.println("");
        System.out.println("3.feladat");
        System.out.print(" a = ");
        int a = sc.nextInt();
        System.out.print(" b = ");
        int b = sc.nextInt();
        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }

        for (int i = a; i < b; i++) {
            if (i % 3 != 0) {
                System.out.print(i + ", ");
            } else {
                System.out.print("3x, ");
            }
        }
        if (b % 3 != 0) {
            System.out.println(b + "");
        } else {
            System.out.println("3x");
        }
    }

    public static void main(String[] args) {
        fv1(); // [a, b] elemei szóközzel -> 2 3 4 5
        fv2(); // [a, b] elemei vesszővel -> 2, 3, 4, 5
        fv3(); // [a, b] (a > b) elemei vesszővel -> 2, 3, 4, 5
        f2(); // [a <= b] elemei visszafelé -> 5, 4, 3, 2
        f3(); // [a <= b] elemei ha x%3 ==0 akkor "(3x)" -> 2, 3x, 4, 5, 3x
    }
}
