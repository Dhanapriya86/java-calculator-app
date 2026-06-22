import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static double modulus(double a, double b) {
        return a % b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("=================================");
        System.out.println("      JAVA CALCULATOR APP");
        System.out.println("=================================");

        while (running) {

            System.out.println("\nChoose Operation");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 6) {
                System.out.println("Thank you for using Calculator!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            try {
                switch (choice) {
                    case 1:
                        System.out.println("Result: " + add(num1, num2));
                        break;

                    case 2:
                        System.out.println("Result: " + subtract(num1, num2));
                        break;

                    case 3:
                        System.out.println("Result: " + multiply(num1, num2));
                        break;

                    case 4:
                        System.out.println("Result: " + divide(num1, num2));
                        break;

                    case 5:
                        System.out.println("Result: " + modulus(num1, num2));
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}
