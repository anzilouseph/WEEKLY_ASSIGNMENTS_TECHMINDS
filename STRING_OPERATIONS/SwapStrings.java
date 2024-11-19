package weeklyAssignment1;

import java.util.Scanner;

public class SwapStrings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string");
        String text1 = sc.nextLine();
        System.out.println("enter the second string");
        String text2 = sc.nextLine();
        System.out.println("Initially ");
        System.out.println("FIRST STRING : "+ text1);
        System.out.println("SECOND STRING : "+ text2);
        int leng1=text1.length();
        int leng2=text2.length();

        text1=text1.concat(text2);
        text2=text1.substring(0,leng1);
        text1=text1.substring(leng1);

        System.out.println("AFTER SWAPPING");
        System.out.println("FIRST STRING : "+ text1);
        System.out.println("SECOND STRING : "+ text2);
    }
}
