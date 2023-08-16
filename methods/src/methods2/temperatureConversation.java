package methods2;
import java.util.Scanner;
public class temperatureConversation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Conversion Tool!");
        System.out.println("Select an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double temperature;
        double convertedTemperature;
        String originalUnit;
        String convertedUnit;

        if (choice == 1) {
            originalUnit = "Celsius";
            convertedUnit = "Fahrenheit";
            System.out.print("Enter the temperature in Celsius: ");
            temperature = scanner.nextDouble();
            convertedTemperature = celsiusToFahrenheit(temperature);
        } else if (choice == 2) {
            originalUnit = "Fahrenheit";
            convertedUnit = "Celsius";
            System.out.print("Enter the temperature in Fahrenheit: ");
            temperature = scanner.nextDouble();
            convertedTemperature = fahrenheitToCelsius(temperature);
        } else {
            System.out.println("Invalid choice. Please choose 1 or 2.");
            scanner.close();
            return;
        }

        System.out.printf("%.1f%s is equivalent to %.1f%s%n", temperature, originalUnit, convertedTemperature, convertedUnit);

	}
	public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}
