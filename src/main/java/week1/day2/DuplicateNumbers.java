package week1.day2;

import java.util.Arrays;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] value = { 1,1,2,56,3,522,12,3};
        Arrays.sort(value);
        for(int i=0; i<value.length-1;i++){
            if(value[i]==value[i+1]){
                System.out.println(value[i]);
            }
        }
    }
}
