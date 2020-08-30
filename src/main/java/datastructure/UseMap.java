package datastructure;

import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/**
		 * @author Jahidul Islam
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * You can use any other retrieval process
		 * Use any databases[ Postgresql] to store data and retrieve data.
		 */

			Map<Integer,String> studentInfo=new HashMap<>();
			studentInfo.put(101,"john");
			studentInfo.put(102,"bob");
			studentInfo.put(103,"peter");
			System.out.println(studentInfo.size());
			System.out.println(studentInfo.get(101));
			for (Map.Entry<Integer,String> entry:studentInfo.entrySet()){
				System.out.println("Key: "+ entry.getKey()+" and Value: "+ entry.getValue());
			}
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"Java");
		map.put(2, "Python");
		map.put(3, "PHP");
		map.put(4, "SQL");
		map.put(5, "C++");
		System.out.println("Tutorial in Guru99: "+ map);
		// Remove value of key 5
		map.remove(5);
		System.out.println("Tutorial in Guru99 After Remove: "+ map);
	}
	}



