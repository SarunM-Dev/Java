import java.util.*;
public class SwappingValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = input.nextInt();
 	System.out.print("Enter the Secound number: ");
        int b = input.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
        System.out.println("Enter the value a:" +a);
 	  System.out.println("Enter the value b:" +b);
    }
}
