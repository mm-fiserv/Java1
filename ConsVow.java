import java.util.Scanner;
public class ConsVow
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = console.nextLine();

        word = word.toLowerCase();

        int vowels;
        int cons;

        while (!word.equals( "quit"))
        {
            vowels =0;
            cons = 0;
            for (char c : word.toCharArray()) {
                if (c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u') {
                    vowels++;
                } else if (c != ' ') {
                    cons++;
                }
            }
            System.out.println("Number of vowels: " + vowels);
            System.out.println("Number of consonants: " + cons);

            System.out.print("Enter a word: ");
            word = console.nextLine();

            word = word.toLowerCase();
        }
    }
}
