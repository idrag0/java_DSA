import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringQueries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString;

        System.out.println("Enter a string:");
        inputString = scanner.nextLine();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Count Vowels and Consonants in a String");
            System.out.println("2. Count the Number of Duplicate Words in a String");
            System.out.println("3. Count Number of Words in Given String");
            System.out.println("4. Count the Number of Occurrences of Substring in a String");
            System.out.println("5. Count the Occurrences of Each Character in String");
            System.out.println("6. Remove Duplicate Words from String");
            System.out.println("0. Exit");

            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    countVowelsAndConsonants(inputString);
                    break;
                case 2:
                    countDuplicateWords(inputString);
                    break;
                case 3:
                    countWords(inputString);
                    break;
                case 4:
                    countSubstringOccurrences(inputString);
                    break;
                case 5:
                    countCharacterOccurrences(inputString);
                    break;
                case 6:
                    removeDuplicateWords(inputString);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void countVowelsAndConsonants(String inputString) {
        int vowels = 0;
        int consonants = 0;

        inputString = inputString.toLowerCase();

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }

    private static void countDuplicateWords(String inputString) {
        String[] words = inputString.split("\\s+");
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        int duplicateCount = 0;
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateCount++;
            }
        }

        System.out.println("Number of duplicate words: " + duplicateCount);
    }

    private static void countWords(String inputString) {
        String[] words = inputString.split("\\s+");
        int wordCount = words.length;

        System.out.println("Number of words: " + wordCount);
    }

    private static void countSubstringOccurrences(String inputString) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the substring to search:");
        String substring = scanner.nextLine();

        int count = 0;
        int index = inputString.indexOf(substring);
        while (index != -1) {
            count++;
            index = inputString.indexOf(substring, index + 1);
        }

        System.out.println("Number of occurrences of substring: " + count);
    }

    private static void countCharacterOccurrences(String inputString) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times");
        }
    }

    private static void removeDuplicateWords(String inputString) {
        String[] words = inputString.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (result.indexOf(word) == -1) {
                result.append(word).append(" ");
            }
        }

        System.out.println("String after removing duplicate words: " + result.toString().trim());
    }
}
