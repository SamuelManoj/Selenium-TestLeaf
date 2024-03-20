package week1.day2;

public class ReverseString {

    public static void main(String[] args) {
        String value = "testing one";
        for (int i = value.length() - 1; i >= 0; i--) {
            System.out.print(value.charAt(i));
        }
    }
}
