package basics;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.println("the number " + i + " is " + i);
            sum+=i;
        }
        System.out.println("the sum of natural numbers are:" + sum);
    }
}
