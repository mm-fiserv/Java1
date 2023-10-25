import java.util.Scanner;
public class CountUppers
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a string of words: ");
        String words = console.nextLine();

        int uppercase = 0;

        for (char c : words.toCharArray())
        {
            if (Character.isUpperCase(c))
            {
                uppercase++;
            }
        }
        System.out.print("Number of uppercase letters: " + uppercase);

    }
}
