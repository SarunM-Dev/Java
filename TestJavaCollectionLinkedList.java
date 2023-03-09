import java.util.*;
class TestJavaCollectionLinkedList{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter value");
	LinkedList<Integer> obj = new LinkedList<Integer>();
	obj.add(input.nextInt());
	obj.add(input.nextInt());
	obj.add(input.nextInt());
	obj.add(input.nextInt());
	obj.add(input.nextInt());
	obj.add(input.nextInt());
	obj.add(input.nextInt());
	obj.add(input.nextInt());
	obj.add(input.nextInt());
	obj.add(input.nextInt());
	obj.add(input.nextInt());

		Iterator itr=obj.iterator();
		System.out.println("value check");
		while(itr.hasNext()){
				System.out.println(itr.next());
	}
    }
}