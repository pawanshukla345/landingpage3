package basics;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int n = sc.nextInt();
        System.out.println("enter the second number:");
        int m = sc.nextInt();
        int gcd=1; //it should initialize otherwise it is giving error
        for(int k=1;k<=n && k<=m;k++){
           if((n%k==0) && (m%k==0)){
              gcd = k;
           }
       }
        System.out.println("the greatest common divisor is:" + gcd);
    }
}
