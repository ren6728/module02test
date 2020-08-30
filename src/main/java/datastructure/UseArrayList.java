package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {

		/**
		 * @author Jahidul Islam
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

			int [] myArray=new int[5];
			myArray[0]=12;

			List<Integer> studentsIdList = new ArrayList<Integer>();
			String name= new String("john");
			System.out.println(name);
			// ArrayList studentsIdList=new ArrayList<Integer>();
			studentsIdList.add(11);
			studentsIdList.add(12);
			studentsIdList.add(13);
			studentsIdList.add(14);
			studentsIdList.add(null);
			studentsIdList.add(11);
			System.out.println("Element in index 0 : "+ studentsIdList.get(0));
			System.out.println("Length of this List: "+ studentsIdList.size());
			for(int i=0; i<=studentsIdList.size()-1;i++){
				System.out.println("Element index "+ i + ":"+ studentsIdList.get(i));
			}
			for(Integer x: studentsIdList){
				System.out.println(x);
			}
		   // Collections.sort(studentsIdList);
			ArrayList<String> cars = new ArrayList<String>();
			cars.add("Volvo");
			cars.add("BMW");
			cars.add("Ford");
			cars.add("Mazda");
			System.out.println(cars);
			//System.out.println(cars.indexOf(cars));
			System.out.println(cars.get(0));
			cars.set(0, "Opel");
			cars.remove(0);
			System.out.println(cars.get(0));
			System.out.println(cars.size());
			for (String i : cars) {
				System.out.println(i);
			}
			studentsIdList.forEach(i -> System.out.println("id : "+i));
//foreach method
		}

	}


