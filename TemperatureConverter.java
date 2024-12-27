import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Please choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit.%n", celsius, fahrenheit);
        } else if (choice == 2) {
            System.out.print("Enter the temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius.%n", fahrenheit, celsius);
        } else {
            System.out.println("Invalid choice. Please restart the program and select a valid option.");
        }

        scanner.close();
    }
}