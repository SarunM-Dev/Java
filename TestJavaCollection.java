import java.util.*;
class TestJavaCollection{
public static void main(String[] args){
	ArrayList<String> obj = new ArrayList<String>();
	obj.add("Sarun");
	obj.add("Sanjay");
	obj.add("Sarun");
	obj.add("Samu");
		Iterator itr=obj.iterator();
		while(itr.hasNext()){
				System.out.println(itr.next());
	}
    }
}