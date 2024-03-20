package week1.day1.assignments;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int value, reminder = 0, i = 2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input");
        value = scan.nextInt();
        boolean x = isPrime(value);
        if (x) {
            System.out.println("This is Prime number");
        } else {
            System.out.println("This is Not Prime number");
        }
    }

    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
