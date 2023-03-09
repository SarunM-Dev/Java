import java.util.*;
class TestJavaCollectionHashMap1{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	HashMap<Integer,String> obj = new HashMap<Integer,String>();
	obj.put(101,"Arun");
	obj.put(102,"Chan");
	obj.put(103,"Banu");
	obj.put(104,"Sabari");
	obj.put(102,"Chan");
	obj.put(104,"Sabari");
	
       
	obj.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
	}
}