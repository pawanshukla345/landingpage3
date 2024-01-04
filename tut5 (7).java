package basics;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter three number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a<=b){
            if(a<=c){
                System.out.println("least is:" + a);
            }
            else{
                System.out.println("least is:" + c);
            }
        }
        else{
            if(b<=c){
                System.out.println("least is:" + b);
            }
            else{
                System.out.println("least is:" + c);
            }
        }
    }
}