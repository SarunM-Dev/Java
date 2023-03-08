import com.sarun.class1;
public class ThrowExceptionExample{
	public static void validate(int age)
{
	if(age<=18) {
	throw new ArithmeticException("Your age is below 18");
 } else {
	System.out.println("Alright!! mark your presence to change the world on 18-10-2023");
  }
}
public static void main(String[] args){
	class1 obj1 = new class1();
	validate(13);
   }
} 