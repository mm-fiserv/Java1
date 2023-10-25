import java.util.Scanner;
import java.util.*;
public class CapitalizeWords
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a string of words: ");
        String words = console.nextLine();

        String[] wordArray = words.split(" ");

        for (int i = 0; i < wordArray.length; i++) {
            if (i % 2 == 0) {
                wordArray[i] = wordArray[i].toUpperCase();
            }
        }

        System.out.println("Modified string: " + String.join(" ", wordArray));
    }
}

