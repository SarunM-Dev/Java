import java.util.*;
class TestJavaCollectionHashMap{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	HashMap<Integer,String> obj = new HashMap<Integer,String>();
	obj.put(101,"Arun");
	obj.put(102,"Chan");
	obj.put(103,"Banu");
	obj.put(104,"Sabari");
	
       
		for(Map.Entry m:obj.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
	}
    }
}