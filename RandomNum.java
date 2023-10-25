import java.util.Scanner;
import java.lang.Math;

public class RandomNum
{
    public static void main(String[] args)
    {
        int rand = (int) (Math.random() * 5) + 1;

        Scanner console = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int guess = console.nextInt();

        while (guess != rand)
        {
            System.out.print("Try again... ");
            guess = console.nextInt();

        }
        System.out.print("You guessed it!!!");
    }
}
