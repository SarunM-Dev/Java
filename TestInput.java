import java.util.Scanner;

public class TestInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create arrays to hold the input values
        String[] stringArray = new String[size];
        int[] intArray = new int[size];

        // Get the string values from the user
        System.out.println("Enter the string values:");
        for (int i = 0; i < size; i++) {
            stringArray[i] = scanner.next();
        }

        // Get the int values from the user
        System.out.println("Enter the int values:");
        for (int i = 0; i < size; i++) {
            intArray[i] = scanner.nextInt();
        }

        // Print the arrays
        System.out.println("The string array is: ");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }

        System.out.println("\nThe int array is: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
    }
}