package week1.day2;

public class FirstDuplicate {

    public static void main(String[] args) {

        String in1 = "testleaf";
        String int2 = "queen";
        String int3 = "helo";
        String[] ele = {in1, int2, int3};
        for (int i = 0; i < ele.length; i++) {
            String value = ele[i];
            char[] x = value.toCharArray();
            boolean found = false;
            for (int j = 0; j < x.length; j++) {
                for (int z = j + 1; z < x.length; z++) {
                    if (x[j] == x[z]) {
                        System.out.println(x[j]);
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
            if (!found) {
                System.out.println("No duplicates");
            } else {
                found = false;
            }
        }

    }
}
