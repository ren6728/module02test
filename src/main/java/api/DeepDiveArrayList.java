package api;

import java.util.ArrayList;

public class DeepDiveArrayList {

    /**
     * @author Jahiudl Islam
     * ArrayList JDK 8 API documantation to be read and ArrayList source code to be viewed
     * Demonastrate your understanding on ArrayList after reading the document
     * You are free to document your understanding using comment
     *
     * */
        public static void main(String[] args) {
            // Size of the ArrayList
            int n = 5;

            // Declaring the ArrayList with initial size n
            ArrayList<Integer> arrli = new ArrayList<Integer>(n);

            // Appending new elements at
            // the end of the list
            for (int i = 1; i <= n; i++)
                arrli.add(i);

            // Printing elements
            System.out.println(arrli);

            // Remove element at index 3
            arrli.remove(3);

            // Displaying the ArrayList
            // after deletion
            System.out.println(arrli);

            // Printing elements one by one
            for (int i = 0; i < arrli.size(); i++)
                System.out.print(arrli.get(i) + " ");
        }
    }


