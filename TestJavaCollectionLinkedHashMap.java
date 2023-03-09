import java.util.*;
class TestJavaCollectionLinkedHashMap{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	LinkedHashMap<Integer,String> obj = new LinkedHashMap<Integer,String>();
	obj.put(101,"Arun");
	obj.put(102,"Chan");
	obj.put(103,"Banu");
	obj.put(null,"Sabari");
	obj.put(102,"Chan");
	obj.put(104,"Sabari");
	
      		for(Map.Entry m:obj.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
	}
    }
}