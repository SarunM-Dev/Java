import java.util.*;
class TestJavaCollectionHashSet{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	Set<String> obj = new HashSet<String>();
	obj.add("Sarun");
	obj.add("Sanjay");
	obj.add("Sarun");
	obj.add("SaMU");
	
		Iterator itr=obj.iterator();
		while(itr.hasNext()){
				System.out.println(itr.next());
	}
    }
}