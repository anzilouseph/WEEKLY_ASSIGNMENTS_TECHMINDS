//1) REVERSE A STRING IN JAVA WITHOUT USING THE REVERSE METHOD
package weeklyAssignment1;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the string which needs to be reversed");
        String text=sc.nextLine();
        String reversedString = "";
        int leng=text.length();
        for(int i=leng-1;i>-1;i--)
        {
            reversedString+=text.charAt(i);
        }
        System.out.println("Original String is : "+text);
        System.out.println("Reversed String is : "+reversedString);
    }
}
