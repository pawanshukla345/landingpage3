package basics;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
         //program to check leap year;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year:");
        int y = sc.nextInt();
        if((y%4==0) && (y%100!=0) || (y%400==0)){
            System.out.println("it is leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}