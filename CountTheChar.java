import java.util.*;
public class CountTheChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        int letterCount = 0;
        int spaceCount = 0;
        int specialCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (Character.isSpaceChar(c)) {
                spaceCount++;
            } else {
                specialCount++;
            }
        }

        System.out.println("Letter count: " + letterCount);
        System.out.println("Space count: " + spaceCount);
        System.out.println("Special character count: " + specialCount);
    }
}
