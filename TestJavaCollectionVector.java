import java.util.*;
class TestJavaCollectionVector{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter name");
	Vector<String> obj = new Vector<String>();
	obj.add(input.nextLine());
	obj.add(input.nextLine());
	obj.add(input.nextLine());
	obj.add(input.nextLine());
	obj.add(input.nextLine());

		Iterator<String> itr=obj.iterator();
		System.out.println("Check name");
		while(itr.hasNext()){
				System.out.println(itr.next());
	}
    }
}