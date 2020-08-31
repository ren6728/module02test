package api;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapAPI {
    /**
     * @author Jahiudl Islam
     * Read Map and HashMap JDK 8 API documantation to be read and Map and HashMap source code to be viewed
     * Demonastrate your understanding on Map and HashMap after reading the documentation
     * You are free to document your understanding using comment
     * Reason to comment is to keep documentation so that next developer can get highlevel understaning of your implementation
     * by reading your comments/documents
     *
     * */
    public static void main(String[] args) {
        /* This is how to declare HashMap */
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        /*Adding elements to HashMap*/
        hmap.put(12, "USA");
        hmap.put(2, "Banladesh");
        hmap.put(7, "China");
        hmap.put(49, "Turkey");
        hmap.put(3, "Newzland");

        /* Display content using Iterator*/
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }

        /* Get values based on key*/
        String var= hmap.get(2);
        System.out.println("Value at index 2 is: "+var);

        /* Remove values based on key*/
        hmap.remove(3);
        System.out.println("Map key and values after removal:");
        Set set2 = hmap.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
            System.out.println(mentry2.getValue());
        }

    }
}

