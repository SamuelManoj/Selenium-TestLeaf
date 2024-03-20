package week1.day2;

public class ReverseWord {

    public static void main(String[] args) {
        String value = "testing one two three";
        String[] test =value.split(" ");
        for (int i = test.length - 1; i >=0 ; i--) {
            System.out.print(test[i] + " ");
        }
    }
}
