package week1.day1.assignments;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int value = 153, reminder, originalnumber;
        double result = 0;
        originalnumber = value;
        while (value != 0) {
            reminder = value % 10;
            result = result + Math.pow(reminder, 3);
            value = value / 10;
        }
        if (result == originalnumber) {
            System.out.println("This is armstrong");
        } else {
            System.out.println("This is not armstrong");
        }
    }
}
