package weeklyAssignment1;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string to check whether its palindrome or not");
        String text=sc.nextLine();
        String s2=text.toLowerCase();

        String new_s="";
        int leng=s2.length();
        for (int i=leng-1;i>-1;i--) {
            new_s += s2.charAt(i);
        }
        if(new_s.equals(s2))
        {
            System.out.println("PALINDROM");
        }
        else
        {
            System.out.println("NOT PALINDROM");
        }
    }
}
