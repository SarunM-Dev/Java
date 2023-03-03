import java.util.Scanner;
public class FinalTheAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 1 number: ");
        float num1 = input.nextFloat();
        System.out.print("Enter the 2 number: ");
        float num2 = input.nextFloat();
        System.out.print("Enter the 3 number: ");
        float num3 = input.nextFloat();
        System.out.print("Enter the 4 number: ");
        float num4 = input.nextFloat();
        System.out.print("Enter the 5 number: ");
        float num5 = input.nextFloat();

        float average = (num1 + num2 + num3 + num4 + num5) / 5;

        System.out.println("The average of the 5 numbers is: " + average);
    }
}
