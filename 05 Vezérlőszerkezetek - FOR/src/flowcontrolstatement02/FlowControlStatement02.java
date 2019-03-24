package flowcontrolstatement02;

import java.util.*;

public class FlowControlStatement02 {

    static Scanner sc = new Scanner(System.in);

    private static void f1() {
                int quantity = 10;

        for(int ii=0; ii<quantity; ii++){
            System.out.println((int)(Math.random()*50+1));
        }
    }

    public static void main(String[] args) {
        f1();
    }

}
