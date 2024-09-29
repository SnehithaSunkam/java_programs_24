//12.Write a Java program that perform integer divisions. The user enters two numbers, Num1 and Num2. The division of Num1 and Num 2 is displayed in the Result. If Num1 or Num2 were not an integer, the program would throw a Number Format Exception. If Num2 were Zero, the program would throw an Arithmetic Exception. 
import java.util.Scanner;

public class IntegerDivision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number (Num1): ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the second number (Num2): ");
            int num2 = Integer.parseInt(scanner.nextLine());

            int result = num1 / num2;
            System.out.printf("Result of %d / %d = %d\n", num1, num2, result);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            scanner.close();
        }
    }
}
