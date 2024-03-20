package week1.day2;

public class FindOccurances {

    public static void main(String[] args) {

        String value = "Bank of America";
        char[] x = value.toCharArray();
        int a = x.length;
        int count = 0;
        for (int i = 0; i < a; i++) {
            if (x[i] == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
