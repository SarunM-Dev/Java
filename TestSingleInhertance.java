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
class TestSingleInhertance{
public static void main(String[] args){
	Dog d = new Dog();
	d.bark();
	d.eat();
  }
}