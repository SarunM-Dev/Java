import java.io.*;
public class BRReadLines{
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String input;
	System.out.println("Enter lines of your text");
	System.out.println("Enter 'end' to quit");
	do 
	   {
		 input = br.readLine();
		 System.out.println(input);
	     }      while(!input.equals("end"));
	        	 
 
}
}
