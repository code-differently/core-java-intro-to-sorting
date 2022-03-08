# Data Structure: Merge Sort Algorithm

Merge sort is a sorting technique based on divide and conquer technique. With worst-case time complexity being Ο(n log n),
it is one of the most respected algorithms.

Merge sort first divides the array into equal halves and then combines them in a sorted manner.

## How Merge Sort Works?

To understand merge sort, we take an unsorted array as the following −

![](./assets/merge/unsorted_array.jpeg)

We know that merge sort first divides the whole array iteratively into equal halves unless the atomic values are 
achieved. We see here that an array of 8 items is divided into two arrays of size 4.

![](./assets/merge/merge_sort_divide_1.jpeg)

This does not change the sequence of appearance of items in the original. Now we divide these two arrays into halves.

![](./assets/merge/merge_sort_divide_2.jpeg)

We further divide these arrays and we achieve atomic value which can no more be divided.

![](./assets/merge/merge_sort_divide_3.jpeg)

Now, we combine them in exactly the same manner as they were broken down. Please note the color codes given to these lists.

We first compare the element for each list and then combine them into another list in a sorted manner. We see that 14 
and 33 are in sorted positions. We compare 27 and 10 and in the target list of 2 values we put 10 first, followed by 27. 
We change the order of 19 and 35 whereas 42 and 44 are placed sequentially.

![](./assets/merge/merge_sort_combine_1.jpeg)

In the next iteration of the combining phase, we compare lists of two data values, and merge them into a list of found
data values placing all in a sorted order.

![](./assets/merge/merge_sort_combine_2.jpeg)

After the final merging, the list should look like this −

![](./assets/merge/merge_sort.jpeg)

Now we should learn some programming aspects of merge sorting.

## Algorithm

Merge sort keeps on dividing the list into equal halves until it can no more be divided. By definition, if it is only 
one element in the list, it is sorted. Then, merge sort combines the smaller sorted lists keeping the new list sorted too.


1. if it is only one element in the list it is already sorted, return.
2. divide the list recursively into two halves until it can no more be divided.
3. merge the smaller lists into new list in sorted order.

## Full Implementation

In the package `com.codedifferently.sorting.merge.integerMergeSorter`

Complete these :

* IntegerMergeSorter
* IntegerMergeSorterDriver