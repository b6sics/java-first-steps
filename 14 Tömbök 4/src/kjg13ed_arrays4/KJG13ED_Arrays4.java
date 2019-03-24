package kjg13ed_arrays4;

public class KJG13ED_Arrays4 {

    private static final int[] T = new int[]{10, 15, 21, 8, 1, 10, 5, 7};

    private static final String[] UTAK = new String[]{"Tunézia", "Málta",
        "Anglia", "Bulgária"};
    private static final String[] FT = new String[]{"100000", "215000",
        "361000", "112000"};

    private static final String[] SZEPTEMBER = new String[]{"személyautó", "5500",
        "10", "utánfutó", "3500", "2", "lakókocsi", "15000", "36"};

    private static void f0(int hossz, char jel) {
        for (int ii = 0; ii < hossz; ii++) {
            System.out.print(jel);
        }
        System.out.println("");
    }

    private static void f1() {
        int n = T.length;
        f0(60, '-');
        System.out.println("\t 1. feladat: sáv diagram");
        f0(60, '-');
        for (int ii = 0; ii < n; ii++) {
            System.out.print("\t");
            for (int jj = 0; jj < T[ii]; jj++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        f0(60, '-');
    }

    private static void f2() {
        int n = UTAK.length;
        System.out.println("\t 2. feladat: \"Last minute\" akció");
        f0(60, '-');
        System.out.println("Last Minute 50%");
        for (int ii = 0; ii < n; ii++) {
            System.out.println(String.format("%12s: %8d Ft",
                    UTAK[ii],
                    Integer.valueOf(FT[ii]) / 2));
        }
        f0(60, '-');
    }

    private static void f3() {
        int n = SZEPTEMBER.length, szumma = 0, szorzat;
        System.out.println("\t 3. feladat: \"Plug & Play\" Autókölcsönző Kft");
        f0(60, '-');
        for (int ii = 0; ii < n; ii += 3) {
            szorzat = Integer.valueOf(SZEPTEMBER[ii + 1]) * Integer.valueOf(SZEPTEMBER[ii + 2]);
            szumma += szorzat;
            System.out.println( String.format("%12s: %8d Ft",
                    SZEPTEMBER[ii], szorzat));
        }
        f0(30, '_');
        System.out.println( String.format("%12s: %8d Ft",
                "összesen", szumma));
        f0(60, '-');
    }

    public static void main(String[] args) {
        f1();
        f2();
        f3();
    }

}
