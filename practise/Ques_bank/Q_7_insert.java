package Ques_bank;

//Write a java program for inserting an element 
// in given loacation in array.

public class Q_7_insert {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = 3;
        int Felement = 10;

        // Create a new array with increased size
        int newArr[] = new int[arr.length + 1];

        // Copy elements from original array to new array
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (i == index) {
                newArr[j] = Felement;
                j++;
            }
            newArr[j] = arr[i];
        }

        // Print the new array
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}


