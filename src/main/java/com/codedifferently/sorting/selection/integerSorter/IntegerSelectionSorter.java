package com.codedifferently.sorting.selection.integerSorter;


import java.util.ArrayList;
import java.util.List;

public class IntegerSelectionSorter {
    public void sort(ArrayList<Integer> integers){
        Integer count = 0;
        Integer outerLength = integers.size();
        for(int i=0; i < outerLength -1; i++){
            Integer minimumIndex = i;
            Integer innerLength = outerLength-1;
            for(int x=0; x < innerLength-1; x++){
                Integer currentValue = integers.get(x);
                if(currentValue < integers.get(minimumIndex)){
                    minimumIndex = x;
                }
                Integer valueAtMinimumIndex = integers.get(minimumIndex);
                Integer temp = valueAtMinimumIndex;
                integers.set(minimumIndex, currentValue);
                integers.set(x, temp);

            }
            count++;
        }
        System.out.println("Took " + count + " times to sort");
    }


    public String printArray(List<Integer> integers)
    {
        StringBuilder builder = new StringBuilder();
        for (Integer integer:integers)
            builder.append(integer + " ");
        return builder.toString().trim();
    }
}
