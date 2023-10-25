import java.util.Scanner;

public class CarpetCalculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter price per square feet: ");
        double price = console.nextDouble();
        console.nextLine();

        System.out.print("Enter room dimensions (width x height): ");
        String room = console.nextLine();

        double totalCost = 0.0;

        while (!room.equals("done")) {
            String[] dimensions = room.split(" x ");
            int width = Integer.parseInt(dimensions[0].trim());
            int height = Integer.parseInt(dimensions[1].trim());

            double roomCost = width * height * price;
            totalCost += roomCost;

            System.out.print("Enter room dimensions: ");
            room = console.nextLine();
        }

        System.out.println("Total cost: " + totalCost);
    }
}
