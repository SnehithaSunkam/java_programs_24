//7.Given two strings s1 and s2, your task is to merge those strings to form a new merged string. A merge operation on two strings is described as follows: Append alternating characters from s1 and s2, respectively, to merged String. Once all of the characters in one of the strings have been merged, append the remaining characters in the other string to merged String.
public class MergeStrings {

    // Method to merge two strings alternately
    public static String mergeStrings(String s1, String s2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;

        // Traverse both strings and append alternating characters
        while (i < s1.length() && j < s2.length()) {
            merged.append(s1.charAt(i++));
            merged.append(s2.charAt(j++));
        }

        // Append remaining characters from s1 (if any)
        while (i < s1.length()) {
            merged.append(s1.charAt(i++));
        }

        // Append remaining characters from s2 (if any)
        while (j < s2.length()) {
            merged.append(s2.charAt(j++));
        }

        return merged.toString();
    }

    // Main method to test the merging function
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "12345";

        // Call the method to merge the strings
        String result = mergeStrings(s1, s2);

        // Display the merged string
        System.out.println("Merged String: " + result);
    }
}
