package week1.day1.assignments;

import java.util.Scanner;

public class ConvertANegativeNumberToPositiveNumber {
    public static void main(String[] args) {
        int value, x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input");
        value = scan.nextInt();
        if (value < 0) {
            x = - value;
            System.out.println(x);
        } else {
            System.out.println(value);
        }
    }
}
