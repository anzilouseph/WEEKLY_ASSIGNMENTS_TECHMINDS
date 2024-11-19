package Weekly_Assesment_Basics;

import java.util.Scanner;

public class If_Else_If
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number (0-9)");
        int number = sc.nextInt();
        if(number<0 && number>9)
        {
            System.out.println("invalid input");
        }
        else if (number==0)
        {
            System.out.println("ZERO");
        }
        else if (number==1)
        {
            System.out.println("ONE");
        }
        else if (number==2)
        {
            System.out.println("TWO");
        }
        else if (number==3)
        {
            System.out.println("THREE");
        }
        else if (number==4)
        {
            System.out.println("FOUR");
        }
        else if (number==5)
        {
            System.out.println("FIVE");
        }
        else if (number==6)
        {
            System.out.println("SIX");
        }else if (number==7)
        {
            System.out.println("SEVEN");
        }else if (number==8)
        {
            System.out.println("EIGHT");
        }else if (number==9)
        {
            System.out.println("NINE");
        }









    }
}
