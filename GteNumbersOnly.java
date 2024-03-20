package week1.day2;

public class GteNumbersOnly {
    public static void main(String[] args) {
        String value = "Amazon total value is 15B";
//        for (int i=0; i<value.length();i++){
//            if(Character.isDigit(value.charAt(i))){
//                System.out.print(value.charAt(i));
//            }
//        }
        String replace = value.replaceAll("[^0-9]","");
        System.out.println(replace);
    }
}
