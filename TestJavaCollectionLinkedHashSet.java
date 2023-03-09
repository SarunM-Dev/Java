import java.util.*;
class TestJavaCollectionLinkedHashSet{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	Set<String> obj = new LinkedHashSet<String>();
	obj.add("Sarun");
	obj.add("Sanjay");
	obj.add("Sarun");
	obj.add("SaMU");
	obj.add(" ");
		Iterator itr=obj.iterator();
		while(itr.hasNext()){
				System.out.println(itr.next());
	}
    }
}