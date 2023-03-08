class Animal{
	public void eat()
{
	System.out.println("eating...");
  }
}
class Dog extends Animal{
	public void bark()
{
		System.out.println("barking...");
  }
}
class Cat extends Animal{
	public void meow()
{
	System.out.println("meowing...");
  }
}	
class TestHierarchicalInhertance{
public static void main(String[] args){
	Cat d = new Cat();
	Dog a = new Dog();
	a.bark();
	d.meow();
	d.eat();

  }
}