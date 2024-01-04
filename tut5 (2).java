package basics;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number:");
       int n = sc.nextInt();
       if(n>=0){
           System.out.println("absolute value of number is: " + n);
       }
       else if(n<0){
           System.out.println("absolute value of number is: " + (-n));
       }
    }
}