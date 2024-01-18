package qbank;

import java.util.Scanner;

public class manu_basedCalculator {
    private static void displayMenu() {
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
        
    }

    private static void process(int key){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        switch (key){
            case 1:
                System.out.println("Result: "+(num1+num2));
                break;
            case 2:
                System.out.println("Result: "+(num1-num2));
                break;
            case 3:
                System.out.println("Result: "+(num1*num2));
                break;
            case 4:
                System.out.println("Result: "+(num1/num2));
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
        int key=sc.nextInt();
        process(key);

    }
}
