import java.util.*;

public class MultipleTheInputValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        
        int cal = num1 * num2;

        System.out.println("The calci of " + num1 + " and " + num2 + " is " + cal);
    }
}
