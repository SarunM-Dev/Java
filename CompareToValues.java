import java.util.*;
public class CompareToValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int firstValue = scanner.nextInt();

        System.out.print("Enter the second value: ");
        int secondValue = scanner.nextInt();

        if (firstValue == secondValue) {
            System.out.println("The values are equal.");
        } else if (firstValue > secondValue) {
            System.out.println("The first value is greater than the second value.");
        } else {
            System.out.println("The second value is greater than the first value.");
        }
    }
}
