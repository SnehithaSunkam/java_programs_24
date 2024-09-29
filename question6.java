//6.Write a java program to find whether given sentence is Pangram or not. If it is pangram, then print 1 else print -1.A pangram is a sentence containing every letter in the English Alphabet. Ex: The quick brown fox jumps over the lazy Dog.
import java.util.Scanner;

public class PangramChecker {

    // Method to check if a given sentence is a pangram
    public static int isPangram(String sentence) {
        // Convert the sentence to lowercase to ignore case sensitivity
        sentence = sentence.toLowerCase();

        // Create a boolean array to mark the occurrence of each letter
        boolean[] alphabetList = new boolean[26];
        int index = 0;
        int flag = 1;

        // Traverse through each character of the sentence
        for (int i = 0; i < sentence.length(); i++) {
            if ('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z') {
                index = sentence.charAt(i) - 'a'; // map characters 'a' to 'z' to index 0 to 25
                alphabetList[index] = true;
            }
        }

        // Check if all the letters (a-z) are present
        for (int i = 0; i < 26; i++) {
            if (!alphabetList[i]) {
                flag = -1;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Check if the sentence is a pangram
        int result = isPangram(sentence);

        // Output the result
        System.out.println(result);

        scanner.close();
    }
}
