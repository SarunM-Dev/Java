import java.util.*;
public class StringToInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String inputString = input.nextLine();

        int inputInt = Integer.parseInt(inputString);


        System.out.println("The number you entered was: " + inputInt);

    }
}
