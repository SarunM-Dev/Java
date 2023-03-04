import java.util.*;
public class SwappingValueThird {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = input.nextInt();
 	System.out.print("Enter the Secound number: ");
        int b = input.nextInt();
	System.out.print("Enter the Third number: ");
        int c = input.nextInt();
	c=a;
	a=b;
	b=c;
        System.out.println("Enter the value a:" +a);
 	  System.out.println("Enter the value b:" +b);
	System.out.println("Enter the value c:" +c);
    }
}
