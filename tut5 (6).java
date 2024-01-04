package basics;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three sides:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a==b) &&(b==c)&&(c==a)){
            System.out.println("it is equilateral triangle");
        }
        else if((a==b) ||(b==c)||(c==a)){
            System.out.println("it is isosceles triangle");
        }
        else{
            System.out.println("scelene triangle");
        }
    }
}