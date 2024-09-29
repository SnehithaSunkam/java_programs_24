//5.Write a Java program to print all numbers below 100,000 that are both prime and Fibonacci number (some examples are 2, 3, 5, 13, etc.).
import java.util.ArrayList;
import java.util.List;

public class PrimeFibonacciNumbers {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Method to generate Fibonacci numbers below a certain limit
    public static List<Integer> generateFibonacci(int limit) {
        List<Integer> fibonacciList = new ArrayList<>();
        int a = 0, b = 1;
        while (a <= limit) {
            fibonacciList.add(a);
            int next = a + b;
            a = b;
            b = next;
        }
        return fibonacciList;
    }

    // Main method to find numbers that are both prime and Fibonacci
    public static void main(String[] args) {
        int limit = 100000;
        List<Integer> fibonacciNumbers = generateFibonacci(limit);

        System.out.println("Prime Fibonacci numbers below 100,000:");
        for (int number : fibonacciNumbers) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }
}
