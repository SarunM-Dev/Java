class A extends Thread
{
	public void run()
{
	int a=5,b=8;
	System.out.println("Thread A :" + (a+b));
  }
}
class B extends Thread
{
	public void run()
{
	int a=5,b=8;
	System.out.println("Thread B :" + (a-b));
  }
}
class C extends Thread
{
	public void run()
{
	int a=5,b=8;
	System.out.println("Thread C :" + (a*b));
  }
}
class D extends Thread
{
	public void run()
{
	int a=5,b=8;
	System.out.println("Thread D :" + (a/b));
  }
}
class DemoMultiThreading
{
public static void main(String[] args){
	A obj1 = new A();
	B obj2 = new B();
	C obj3 = new C();
	D obj4 = new D();
	obj1.start();
	obj2.start();
	obj3.start();
	obj4.start();
  }
}