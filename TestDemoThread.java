import java.util.*;
public class Batch13 extends Thread
{
	public void run();
	Scanner input =  new Scanner(System.in);
	System.out.println("Enter any Number");
		int a = input.nextInt();
        	 if(n==0||n==1){  
   		System.out.println(n+" is not prime number");      
	}else{  
   		for(i=2;i<=m;i++){      
   		 if(n%i==0){      
   	 	 System.out.println(n+" is not prime number");      
    	 	flag=1;      
    	 	break;      
     }      
}      
   if(flag==0)  
	{ System.out.println(n+" is prime number"); }  
  }
class TestDemoThread
{
public static void main(String[] args){
	Batch13 obj = new Batch13();
	obj.start();
  }
}
}