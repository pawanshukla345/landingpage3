package basics;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the cost price:");
      int cp = sc.nextInt();
      System.out.println("enter the selling price:");
      int sp = sc.nextInt();
      if(sp>cp){
          System.out.println("profit");
      }
      else if(cp>sp){
          System.out.println("loss");
      }
      else{
          System.out.println("break");
      }
    }
}