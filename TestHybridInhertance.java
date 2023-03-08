class Human{
	public void showHuman()
{
	System.out.println("Human Class");
  }
}
interface father{
	public void show();
}
interface mother{
	public void show();
}
class Child extends Human implements father,mother{
	public void show()
{

	System.out.println("invoking show  method");
  }
	public void showChild()
{
	System.out.println("invoking show human method");
  }
}
public class TestHybridInhertance{
public static void main(String[] args){
	Child a = new Child();
	a.showHuman();
	a.show();
	a.showChild();
  }
}

