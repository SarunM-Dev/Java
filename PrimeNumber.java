import java.util.*;
public class PrimeNumber{
public static void main(String[] args){
Scanner input =  new Scanner(System.in);
System.out.println("Enter any Number");
int a = input.nextInt();
int b = 20;
for (int i = 1; i <= num; i++) {
  	count = 0;
   	for (int j = 2; j <= i / 2; j++) {
    	if (i % j == 0) {
     	count++;
     	break;
}
}

   	if (count == 0) {
    	System.out.println(i);
   }
}
}
}