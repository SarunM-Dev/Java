import java.io.*; 
public class exceptioncatch 
{
	 public static void main(String args[]) 
	{
		 int i=0, j=0; float x; 
	BufferedReader b = new BufferedReader(new InputStreamReader(System.in)); 
	try // start try block 
	{ 
	System.out.println(" Enter the I value:"); 
	i = Integer.parseInt(b.readLine()); 
	System.out.println(" Enter the J value:"); 	j=Integer.parseInt(b.readLine()); 
	if(i==0) throw new ArithmeticException(); // throw statement 	x=i/j; 
	}
	catch(IOException ie) { 
	System.out.println(ie); 
}
 catch(ArithmeticException ae) // catch block with the argument of ArithmeticException 
{ 	
	System.out.println("divided by zero"); 
}
}
} 
