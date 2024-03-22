package week3.day1.assignments;

public class ChangeOddIndexToUpperCase {
    public static void main(String[] args) {
//	 Pseudo Code

//	 * Declare String Input as Follow
//	 * String test = "changeme";
        String test = "changeme";

//	 * a) Convert the String to character array
        char[] ch_test = test.toCharArray();

//	 * b) Traverse through each character (using loop)
        for (int i = 0; i < ch_test.length; i++) {

//	 * c)find the odd index within the loop (use mod operator)
            if (i % 2 == 0) {

//	 * d)within the loop, change the character to uppercase, if the index is odd else don't change
                System.out.print(Character.toUpperCase(ch_test[i]));
            }
            else{
                System.out.print(ch_test[i]);
            }
        }
    }
}
