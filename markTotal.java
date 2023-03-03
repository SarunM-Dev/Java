import java.util.*;
public class markTotal{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Your Mark");
	int a = input.nextInt();
	if (a<35){
	System.out.println("D");
} else if(a>=35&&a<60) {
	System.out.println("C");
} else if(a>=60&&a<85) {
	System.out.println("B");
} else if(a>=85&&a<=100) {
	System.out.println("A");
} else {
	System.out.println("Invaild");
}
}
}