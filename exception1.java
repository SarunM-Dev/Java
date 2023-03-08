import java.io.*;
 public class exception1
 { 
	public static void main(String[] args) throws Exception
	{ 
	try 
	{ 
	int numeric;
	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 	System.out.print("Enter Your Name:");
 	numeric = Integer.parseInt(in.readLine()); 
	} 
	catch(NumberFormatException ex) // catch block with an argument
 	{ 
System.out.println("You are entered"+" "+ex.getMessage()+" " + "Catch the Exception:Non numeric value.");
 System.exit(0); 
	}
	}
} 
