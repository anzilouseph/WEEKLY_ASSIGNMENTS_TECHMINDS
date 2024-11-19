package Weekly_Assesment_Basics;

import java.util.*;

public class Simple_Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        System.out.println(a+ " +  "+b +" = "+(a+b));
        System.out.println(a+ " -  "+b +" = "+(a-b));
        System.out.println(a+ " *  "+b +" = "+(a*b));
        System.out.println(a+ " /  "+b +" = "+(a/b));
        System.out.println(a+ " %  "+b +" = "+(a%b));



    }
}
