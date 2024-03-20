package week1.day2.assignments.optional;

public class MyCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(10, 20, 30);
        int subtract = calculator.sub(20, 18);
        double muliple = calculator.mul(25.3, 313.2);
        float divide = calculator.divide(30.33f, 3f);

        System.out.println("addition " + sum);
        System.out.println("Subtraction " + subtract);
        System.out.println("Multiplication " + muliple);
        System.out.println("Division " + divide);

    }
}
