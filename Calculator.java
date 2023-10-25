import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = console.nextInt();

        System.out.print("Enter second number: ");
        int num2 = console.nextInt();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String ope = console.next();

        int result = 0;

        if (ope.equals("add"))
        {
            result = num1 + num2;
        }
        else if (ope.equals("sub"))
        {
            result = num1 - num2;
        }
        else if (ope.equals("mul"))
        {
            result = num1 * num2;
        }
        else if (ope.equals("div"))
        {
            if (num2 != 0)
            {
                result = num1 / num2;
            }
            else
            {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
        }
        else
        {
            System.out.println("Error: Invalid operation");
            return;
        }
        System.out.print("Result: " + result);
    }
}
