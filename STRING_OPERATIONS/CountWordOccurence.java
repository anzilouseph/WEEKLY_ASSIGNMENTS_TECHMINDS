package weeklyAssignment1;

import java.util.Scanner;

public class CountWordOccurence {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("enter the sentence");
        String text = sc.nextLine();

        System.out.println("enter the word to check the occurence");
        String word = sc.nextLine();

        String[] words_list=text.split(" ");
        for(String i : words_list)
        {
            if(i.equals(word))
            {
                count++;
            }

        }
        System.out.println(count);

    }
}
