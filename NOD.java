package YASD.YASD;

import java.util.Scanner;

public class NOD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a : ");
        int a = scanner.nextInt();
        System.out.println("Input b : ");
        int b = scanner.nextInt();

        if(a>b){
            a = a-b;
        }
        else if(b>a){
            b = b-a;
        }
        System.out.println("N O D e : " + a + b);
    }
}
