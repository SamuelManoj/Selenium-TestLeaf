package week1.day2.assignments.optional;

public class ReverseCharacterPseudocode {
    public static void main(String[] args) {
        //Declare a string input
        String input = "de12ef35777777yu";

        //declare two empty strings as reverse and final
        String reverse = "";
        String finput = "";

        //Initialize an int variable j=0
        int j = 0;

        char[] cinput = input.toCharArray();

        //iterate with reverse for loop and store it in the  variable reverse
        for (int i = cinput.length - 1; i >= 0; i--) {
            if (Character.isLetter(cinput[i])) {
                reverse = reverse + cinput[i];
            } else {
                finput = finput + cinput[i];
            }
        }
        System.out.println(reverse);
        System.out.println(finput);
    }
}
