import java.util.Scanner;
public class ChartoAscii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char c = input.next().charAt(0);

        int asciiValue = (int) c;

        System.out.println("The ASCII value of " + c + " is " + asciiValue);
    }
}
