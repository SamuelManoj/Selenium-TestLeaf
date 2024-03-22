package week3.day1.assignments;

public class ReverseEvenWords {
    public static void main(String[] args) {

        //Build a logic to reverse the even position words (output: I ma a erawtfos tester)
//			 Pseudo Code:
//
//			 * Declare the input as Follow
//		      		String test = "I am a software tester";
        String test = "I am a software tester";

        //a) split the words and have it in an array
        String[] arr_test = test.split(" ");

        //b) Traverse through each word (using loop)
        for (int i = 0; i < arr_test.length; i++) {
            String value = arr_test[i];
            if (i % 2 != 0) {
                for (int j = value.length() - 1; j >= 0; j--) {
                    System.out.print(value.charAt(j));
                }
                System.out.print(" ");
            } else {
                System.out.print(value + " ");
            }
        }
    }
}
