package basics;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        //table of n
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();
        for(int i=n;i<=n*10;i+=n){
            System.out.println(i);
        }
    }
}
