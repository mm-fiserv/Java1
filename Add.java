import java.util.Scanner;
public class Add
{
    public static void main(String[] args)
    {

        Scanner console = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = console.nextInt();

        System.out.print("Enter second number: ");
        int num2 = console.nextInt();

        int result = num1 + num2;

        System.out.print("Result: " + result);

    }

}
