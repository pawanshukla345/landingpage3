package pw;
import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //area of circle;
        System.out.print("enter the radius:");
        double radius = sc.nextDouble();
        System.out.println("area of circle with radius "+radius+" is: " + 3.141592*radius*radius);

        //simple interest
        System.out.print("\nenter the principal value: ");
        int p = sc.nextInt();
        System.out.print("\nenter the rate: ");
        double r = sc.nextDouble();
        System.out.print("\nenter the time");
        double t = sc.nextDouble();
        System.out.println("\nthe simple interest is : " + p*r*t/100);



    }
}


