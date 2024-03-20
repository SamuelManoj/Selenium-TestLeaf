package week1.day2;

public class LearnString {

    public static void main(String[] args) {

        String value = "Bank of America";
        int length = value.length();
        System.out.println(length);
        char[] x = value.toCharArray();
        System.out.println(x);
        System.out.println(value.toLowerCase());
        System.out.println(value.toUpperCase());
        System.out.println(value.contains("Bank"));
        System.out.println(value.endsWith("rica"));
        System.out.println(value.startsWith("bn"));
        System.out.println(value.indexOf('a'));
        System.out.println(value.lastIndexOf('a'));
    }
}
