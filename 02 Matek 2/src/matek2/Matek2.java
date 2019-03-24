
package matek2;
import java.util.*;// IO műveletek
        
public class Matek2 {

        private static void f1(){
            Scanner sc = new Scanner(System.in);
            System.out.print("a= "); int a= sc.nextInt();
            System.out.print("b= "); int b= sc.nextInt();
            System.out.println(a+" + "+b+" = "+(a+b));
            if (a>b){
              System.out.println("A nagyobb szám: " + a );  
            }else{
              System.out.println("A nagyobb szám: " + b );  
            }
        }

    public static void main(String[] args) {
            f1();
        }
}
