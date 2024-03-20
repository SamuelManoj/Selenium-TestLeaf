package week1.day2.assignments.mandatory;

public class ReverseEvenWords {
    public static void main(String[] args) {
        String test = "I am a software tester";
        String[] arr = test.split(" ");
        for(int i=0;i<=arr.length-1;i++){
            String word = arr[i];
            for(int j=word.length()-1;j>=0;j--){
                System.out.print(word.charAt(j));
            }
            System.out.print(" ");
        }
    }
}
