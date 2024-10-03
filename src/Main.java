import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double cTemp = 0;
        double fTemp = 0;
        boolean validValue = false;

        do {
            System.out.println("Please enter a temperature in degrees C to be converted to degrees F:");
            if (scan.hasNextDouble()) {
                cTemp = scan.nextDouble();
                validValue = true;
            } else {
                System.out.println("You have entered an invalid temperature value. Please try again.");
            }
            scan.nextLine();
        } while (!validValue);

        fTemp = (cTemp * 1.8) + 32;
        System.out.printf("%-15s %10.2f", "Degrees C:", cTemp);
        System.out.printf("\n%-15s %10.2f", "Degrees F:", fTemp);
    }
}