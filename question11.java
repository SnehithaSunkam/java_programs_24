//11.Write a Java program that works as a simple calculator. Use a switch statement to accept 2 numbers and an operator for the +, -,*, % operations. Perform arithmetic operation display the result. Handle any possible exceptions like divided by zero for division operation.
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, %): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, result);
                break;
            case '%':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero.");
                } else {
                    result = num1 % num2;
                    System.out.printf("%.2f %% %.2f = %.2f\n", num1, num2, result);
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }

        scanner.close();
    }
}
