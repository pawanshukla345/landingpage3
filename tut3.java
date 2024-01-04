package pw;

import java.util.Scanner;

public class assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers:");
        int x = sc.nextInt();
        double y = sc.nextDouble();
        float z = sc.nextFloat();

        //addition operation
        System.out.println("addition of int and double type is : " +(x+y));
        System.out.println("addition of double and float is : " +(y+z));
        System.out.println("addition of int and float is : " +(x+z));

        //subtraction
        System.out.println("\nsubtraction of int and double type is : " +(x-y));
        System.out.println("subtraction of double and float is : " +(y-z));
        System.out.println("subtraction of int and float is : " +(x-z));

        //multiplication
        System.out.println("\nmultiplication of int and double type is : " +(x*y));
        System.out.println("multiplication of double and float is : " +(y*z));
        System.out.println("multiplication of int and float is : " +(x*z));

        //division
        System.out.println("\ndivision of int and double type is : " +(x/y));
        System.out.println("division of double and float is : " +(y/z));
        System.out.println("division of int and float is : " +(x/z));

    }
}
