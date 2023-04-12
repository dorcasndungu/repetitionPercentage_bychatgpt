import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the first block of strings
        System.out.print("Enter the first block of strings (separated by spaces): ");
        String block1 = input.nextLine();

        // Enter the second block of strings
        System.out.print("Enter the second block of strings (separated by spaces): ");
        String block2 = input.nextLine();

        // Split the strings into words and add them to sets
        HashSet<String> set1 = new HashSet<String>();
        for (String word : block1.split("\\s+")) {
            set1.add(word);
        }

        HashSet<String> set2 = new HashSet<String>();
        for (String word : block2.split("\\s+")) {
            set2.add(word);
        }

        // Find the repeated words and calculate the percentage of repetition in the second block
        int numRepeatedWords = 0;
        for (String word : set1) {
            if (set2.contains(word)) {
                numRepeatedWords++;
            }
        }
        double percentageRepeatedWords = ((double)numRepeatedWords / set2.size()) * 100.0;

        // Print the repeated words and the percentage of repetition
        System.out.print("Repeated words: ");
        for (String word : set1) {
            if (set2.contains(word)) {
                System.out.print(word + " ");
            }
        }
        System.out.println();
        System.out.println("Percentage of repetition in the second block: " + percentageRepeatedWords + "%");
    }
}