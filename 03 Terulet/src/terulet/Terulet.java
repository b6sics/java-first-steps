
package terulet;
import java.util.*;
   
public class Terulet {
    
    static Scanner sc = new Scanner(System.in);
    
    private static void f1(){
            System.out.print("a= "); int a= sc.nextInt();
            System.out.print("b= "); int b= sc.nextInt();
            System.out.println("t = "+((double)a*b)/2);
            System.out.println("t = "+(double)(a*b)/2);
            System.out.println("t = "+(a*b)/2);
    }
       public static void main(String[] args) {
        f1();
    }
    
}
