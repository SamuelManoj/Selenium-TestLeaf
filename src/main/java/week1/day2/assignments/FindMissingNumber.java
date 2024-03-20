package week1.day2;

import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] num = {8,7,6,3,5,4,11,9};
        Arrays.sort(num);
        for(int i=1;i<num.length;i++){
            if(num[i]+1!=num[i+1]){
                System.out.println(num[i]+1);
                break;
            }
        }
    }
}
