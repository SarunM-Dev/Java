class Animal{
	public void eat()
{
	System.out.println("eating...");
  }
}
class Human{
	public void toxic()
{
		System.out.println("All human are toxic");
  }
}
class Dog extends Animal,Human{
	public void bark()
{
	System.out.println("barking...");
  }
}	
class TestMultipleInhertance{
public static void main(String[] args){
	Dog d = new Dog();
	d.bark();
	d.eat();
  }
}