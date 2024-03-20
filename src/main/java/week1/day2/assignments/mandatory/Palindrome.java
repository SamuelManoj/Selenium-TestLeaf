package week1.day2.assignments.mandatory;

public class Palindrome {
    public static void main(String[] args) {
        String value = "madam";
        String reverse= "";
        for (int i = value.length()-1; i>=0;i--) {
            reverse = reverse + value.charAt(i);
        }
        if(value.equals(reverse)){
            System.out.print("Its palindrome");
        }
        else{
            System.out.print("Its not palindrome");

        }
    }
}
