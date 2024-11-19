//2) WAP TO COUNT THE OCCURENCE OF THE GIVEN CHARACTER
package weeklyAssignment1;
import java.util.Scanner;
public class countOccurence_of_Character {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String text=sc.nextLine();
        System.out.println("enter the character");
        char c =sc.next().charAt(0);
        int leng=text.length();
        int count=0;
        for(int i=0;i<leng;i++)
        {
            if(text.charAt(i)==c)
            {
                count++;
            }
        }
        System.out.println("their are "+count+ "  "+c+ "   present in  "+text);
    }
}
