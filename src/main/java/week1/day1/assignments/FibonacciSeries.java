package week1.day1.assignments;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int value, first = 0, second = 1, sum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the range");
        value = scan.nextInt();
        System.out.print(first + ", " + second);
        for (int i = 1; i < value - 1; i++) {
            System.out.print(", ");
            sum = first + second;
            first = second;
            second = sum;
            System.out.print(sum);
        }
    }
}
