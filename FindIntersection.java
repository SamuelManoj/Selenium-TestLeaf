package week1.day2.assignments.mandatory;

public class FindIntersection {
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 11, 4, 6, 7};
        int[] arr2 = {1, 2, 8, 4, 9, 7};
        boolean matchfound = false;
        for (int j : arr1) {
            for (int k : arr2) {
                if (j == k) {
                    System.out.println(j);
                    matchfound = true;
                    break;
                }
            }
            if(matchfound){
                break;
            }
        }
    }
}
