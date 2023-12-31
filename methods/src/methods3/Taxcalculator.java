package methods3;
import java.util.Scanner;
public class Taxcalculator {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the purchase amount: ");
	        double purchaseAmount = scanner.nextDouble();

	        System.out.print("Enter the tax rate (in decimal form): ");
	        double taxRate = scanner.nextDouble();

	        double totalCost = calculateTotalWithTax(purchaseAmount, taxRate);
	        System.out.printf("Total cost including tax: %.2f%n", totalCost);

	        scanner.close();
	    }

	    public static double calculateTotalWithTax(double purchaseAmount, double taxRate) {
	        double taxAmount = purchaseAmount * taxRate;
	        return purchaseAmount + taxAmount;
	    }
	}


