package flowcontrolstatement01;

import java.util.*;

public class FlowControlStatement01 {

    static Scanner sc = new Scanner(System.in);

    private static void f1() {
        int money = 200;
        String ask = "A csoki ára = ",
                ans1 = "Kevés a pénzem",
                ans2 = "Vegyünk 1 csokit!";

        System.out.print(ask);
        int a = sc.nextInt();

        if (money < a) {
            System.out.println(ans1);
        }
        if (money >= a) {
            System.out.println(ans2);
        }
        System.out.println("");
    }

    private static void f2() {
        String ask = "Kérek egy pozitív egész számot = ",
                ans1 = "páratlan",
                ans2 = "páros";

        System.out.print(ask);
        int a = sc.nextInt();

        if (a % 2 != 0) {
            System.out.println(ans1);
        } else {
            System.out.println(ans2);
        }
        System.out.println("");
    }

    private static void f3() {
        String ask = "Kérem a dolgozat pontszámát [0;50] = ",
                ans1 = "elégtelen",
                ans2 = "elégséges",
                ans3 = "közepes",
                ans4 = "jó",
                ans5 = "jeles",
                ans6 = "Hibás pontszám!";

        System.out.print(ask);
        int a = sc.nextInt();

        if (a < 10) {
            System.out.println(ans1);
        } else if (a < 20) {
            System.out.println(ans2);
        } else if (a < 30) {
            System.out.println(ans3);
        } else if (a < 40) {
            System.out.println(ans4);
        } else if (a < 50) {
            System.out.println(ans5);
        } else if (a > 49) {
            System.out.println(ans6);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        f1();
        f2();
        f3();
    }

}
