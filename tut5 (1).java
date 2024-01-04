package basics;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number:");
       int n = sc.nextInt();
       if(n%2==0){
           System.out.println("even number");
       }
       else if(n%2==1){
           System.out.println("odd number");
       }
    }
}
