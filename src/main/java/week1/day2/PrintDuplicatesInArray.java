package week1.day2;

import java.util.Arrays;

public class PrintDuplicatesInArray {

    public static void main(String[] args) {

        int[] arr = {14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20};
        Arrays.sort(arr);
        int value = arr[0];

        for (int i = 1; i < arr.length - 1; i++) {
            if (value == arr[i]) {
                System.out.println(arr[i]);
//                break;
            } else {
                value = arr[i];
            }
        }

        // get the length of the array
        // declare an int variable named count

        // iterate from 0 to the array length-1 (outer loop starts here)

        // assign 0 to count

        // iterate from i to the length of the array by adding 1 to it (inner loop starts here)

        // compare both the loop variables & check they're equal

        // print the matching value


    }

}