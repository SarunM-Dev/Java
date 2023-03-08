class Cloneing implements Cloneable{
	int rollno;
	String name;

Cloneing(int rollno,String name)
{
	this.rollno=rollno;
	this.name=name;
}
public Object clone()throws CloneNotSupportedException{
	return super.clone();
}
public static void main(String[] args)
{
	try{
	     Cloneing obj = new Cloneing(101,"Sarun");
 		Cloneing obj1 =(Cloneing)obj.clone();
		  System.out.println(obj.rollno+" "+obj.name);
			 System.out.println(obj1.rollno+" "+obj1.name);
}
	catch(CloneNotSupportedException c)
{}
}
}