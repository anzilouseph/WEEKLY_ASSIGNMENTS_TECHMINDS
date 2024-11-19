package Weekly_Assesment_Basics;

import java.util.Scanner;

public class Circle_Area
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius");
        double r= sc.nextDouble();
        System.out.println("Area of the circle with radius "+r +" is : "+ (3.14*r*r));

    }
}
