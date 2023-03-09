import java.util.*;
class TestJavaCollectionStack{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	Stack<String> obj = new Stack<String>();
	obj.push("Sarun");
	obj.push("Sanjay");
	obj.push("Sabari");
	obj.add("Sarun");
	obj.push("samu");
	obj.push("Mahesh");
	obj.pop();
	obj.pop();
		Iterator<String> itr=obj.iterator();
		while(itr.hasNext()){
				System.out.println(itr.next());
	}
    }
}