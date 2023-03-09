class Batch13 implements Runnable
{
	public void run()
{
	int a=5,b=8;
	System.out.println("Thread Batch13 :" + (a*b));
  }
}
class DemoThreadRunnable
{
public static void main(String[] args){
	Batch13 obj = new Batch13();
	Thread obj1 = new Thread();
	obj.start();
  }
}