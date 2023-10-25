import java.util.Scanner;
public class WordPalindrome {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Input word: ");
        String word = console.nextLine();

        String reverse = new StringBuilder(word).reverse().toString();

        if (word.equalsIgnoreCase(reverse)) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}

