package week1.day1.assignments;

public class CheckIfTheNumberIsPositiveOrNegative {
    public static void main(String[] args) {
        int value = -35;
        if (value > 0) {
            System.out.println("This is positive number");
        } else if (value < 0) {
            System.out.println("This is negative number");
        } else {
            System.out.println("This is neither positive nor negative number");
        }
    }
}
