package week1.day2.assignments.optional;

public class SumOfDigitsFromStringMethod1 {
    public static void main(String[] args) {
        String text = "Tes12Le79af65";
        int sum = 0;
        String text1 = text.replaceAll("[a-zA-Z]", "");
        char[] arr = text1.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int x = Character.getNumericValue(arr[i]);
            sum = sum + x;
        }
        System.out.print(sum);
    }
}
