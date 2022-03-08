package com.codedifferently.sorting.selection.integerSorter;

import java.util.ArrayList;
import java.util.Arrays;

public class IntegerSelectionSorterDriver {
    public static void main(String args[])
    {
        IntegerSelectionSorter ob = new IntegerSelectionSorter();
        ArrayList<Integer> integerList = new ArrayList<Integer>(Arrays.asList(64, 34, 25, 12, 22, 11, 90));
        System.out.println("Before: "+ob.printArray(integerList));
        ob.sort(integerList);
        System.out.println("After: "+ob.printArray(integerList));
    }

}
