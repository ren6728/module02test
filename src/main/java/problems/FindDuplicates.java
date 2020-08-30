package problems;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindDuplicates {

    /**
     * Write Code To Filter Duplicate Elements From An Array?
     * */


    public static void main(String[] args)
    {
        List li1 = new ArrayList<>(Arrays.asList(2, 2, 4, 4, 6, 6, 8, 8, 1, 3, 5, 7, 9));
        System.out.println("Before removing duplicate elements: " + li1);
        // create new list from elements of original list
        List li2 = (List) li1.stream().distinct().collect(Collectors.toList());
        // printing ArrayList with duplicates removed
        System.out.println("After removing duplicate elements: " + li2);
    }
    }
