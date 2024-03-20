package week1.day2;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,4,24,5};
        int value = 6;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+arr[i+1]==value){
                System.out.println(arr[i] + ", " + arr[i+1]);
            }
        }
    }
}

