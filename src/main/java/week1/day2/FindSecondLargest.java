package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

    public static void main(String[] args) {

        // Here is the input
        int[] data = {9, 2, 11, 4, 6, 7, 8};
        Arrays.sort(data);
        int i = data.length;
        System.out.println(data[i - 2]);
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */


    }


}