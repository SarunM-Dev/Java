import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();

        int decimal = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = Integer.parseInt(String.valueOf(binary.charAt(i)));
        }

        System.out.println("Decimal equivalent of " + binary + " is " + decimal);
    }
}
