import java.util.Scanner;
package qbank;

public class Tokenizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String[] tokens = input.split(" ");
        
        boolean found = false;
        for (String token : tokens) {
            if (token.equals("India")) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("The word 'India' is present in the token list.");
        } else {
            System.out.println("The word 'India' is not present in the token list.");
        }
        
        scanner.close();
    }
}
    
