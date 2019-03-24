package matek;

public class Matek {
private static int a0=7, b0=10;
    
    private static void f1(int a, int b){
        System.out.println(a+" + "+b+" = "+(a+b));
    }
    private static void f2(int a, int b){
        System.out.println(a+" * "+b+" = "+(a*b));
    }
    private static void f3(int a, int b){
        System.out.println(a+" - "+b+" = "+(a-b));
    }

    public static void main(String[] args) {
        f1(a0, b0);//metódus
        f2(a0, b0);//metódus
        f3(a0, b0);//metódus
    }
    
}
