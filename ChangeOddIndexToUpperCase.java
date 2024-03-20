package week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {
    public static void main(String[] args) {
        String test = "changeme";
        char[] value = test.toCharArray();
        for(int i=0;i<value.length;i++){
            if(i%2!=0){
                System.out.print(value[i]);
            }
            else {
                System.out.print(String.valueOf(value[i]).toUpperCase());
            }
        }
    }
}
