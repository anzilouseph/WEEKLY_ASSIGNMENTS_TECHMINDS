package Weekly_Assesment_Basics;

import java.util.Scanner;

public class IntegerEqual
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int n1 = sc.nextInt();
        System.out.println("enter second number");
        int n2 = sc.nextInt();
        if(n1==n2)
        {
            System.out.println("EQUAL");
        }
        else
        {
            System.out.println("NOT EQUAL");
        }
    }
}
