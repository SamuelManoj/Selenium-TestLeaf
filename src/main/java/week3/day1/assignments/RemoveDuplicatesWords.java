package week3.day1.assignments;//package week3.day1.assignments;

import java.util.Arrays;
public class RemoveDuplicatesWords {
    public static void main(String[] args) {
        //a) Use the declared String text as input
//		String text = "We learn java basics as part of java sessions in java week1";
        String text = "We learn java basics as part of java sessions in java week1";

//	 * b) Initialize an integer variable as count
        int count;

//	 * c) Split the String into array and iterate over it
        String[] arr_text = text.split(" ");

//	 * d) Initialize another loop to check whether the word is there in the array
        for(int i=0;i< arr_text.length;i++){
            String value = arr_text[i];
            for(int j=i+1;j<arr_text.length;j++){
                if(value.equals(arr_text[j])){
                    arr_text[j]="";
                }
            }
            System.out.print(value + " ");
        }

//	 * e) if it is available then increase and count by 1.
//	 * f) if the count > 1 then replace the word as ""
//
//	 * g) Displaying the String without duplicate words
    }

}
