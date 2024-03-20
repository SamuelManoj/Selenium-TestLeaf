package week1.day1;

public class OddOrEven {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " = TANPAN");
            } else if (i % 5 == 0) {
                System.out.println(i + " = Pan");
            } else if (i % 3 == 0) {
                System.out.println(i + " = Tan");
            }
        }
    }
}
