import java.util.Scanner;
public class Diagonal
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        for (String word : words) {
            printDiagonal(word);
            System.out.println(); // Move to the next line for the next word
        }
    }

    public static void printDiagonal(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(word.charAt(i));

        }
    }
}
