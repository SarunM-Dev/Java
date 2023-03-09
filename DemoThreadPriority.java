class A extends Thread
{
	public void run()
{
	int a=5,b=8;
	System.out.println("ADD A :" + (a+b));
  }
}
class B extends Thread
{
	public void run()
{
	int a=5,b=8;
	System.out.println("Sub B :" + (a-b));
  }
}
class C extends Thread
{
	public void run()
{
	int a=5,b=8;
	System.out.println("Multi C :" + (a*b));
  }
}
class D extends Thread
{
	public void run()
{
	int a=5,b=8;
	System.out.println("Division D :" + (a/b));
  }
}
class DemoThreadPriority
{
public static void main(String[] args){
	A obj1 = new A();
	B obj2 = new B();
	C obj3 = new C();
	D obj4 = new D();
	obj3.setPriority(Thread.MAX_PRIORITY);
	obj2.setPriority(obj1.getPriority()+1);
	obj1.setPriority(Thread.MIN_PRIORITY);
	
	obj1.start();
	obj2.start();
	obj3.start();
  }
}