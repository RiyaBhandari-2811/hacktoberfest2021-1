// Contributor Info :
//     Name : Riya Bhandari 
//     Git : https://github.com/RiyaBhandari-2811

// Code Info : 
//     Problem Statement : write a program for binary search in JAVA 


import java.util.*;

public class BinarySearch {

    public static void main(String args[]) {
        int numArray[] = { 5, 10, 15, 20, 25, 30, 35 };

        System.out.println("The input array is : " + Arrays.toString(numArray));

        // target to be searched
        int target = 20;

        System.out.println("\ntarget to be searched = " + target);

        // set start to start index
        int start = 0;

        // set end to end elements in array
        int end = numArray.length - 1;

        // calculate mid of the array
        int mid = (start + end) / 2;

        // while start and end do not overlap
        while (start <= end) {

            // if the mid < target, then target to be searched is in the start half of array
            if (numArray[mid] < target) {
                start = mid + 1;
            } else if (numArray[mid] == target) {
                // if target = element at mid, then print the location
                System.out.println("Element is found at index : " +  mid);
                break;
            } else {
                // the target is to be searched in the second half of the array
                end = mid - 1;
            }
            mid = (start + end) / 2;

        }
        
        // if start and end overlap, then target is not present in the array
        if (start > end) {
            System.out.println("Element is not found!");
        }
    }

}
