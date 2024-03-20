package week1.day2;

public class RemoveVowels {
    public static void main(String[] args) {
        String s = "testleaf";
        String s1 = "aeioukk";
        String s2 = "aeiouAEIOU";
        String[] SS = {s,s1};
        for(int i=0;i<SS.length;i++){
            String value = SS[i];
            for(int j=0; j<value.length();j++){
                if(s2.indexOf(value.charAt(j))==-1){
                    System.out.print(value.charAt(j));
                }
            }
            System.out.println();
        }
//        s.replaceAll("[aeiouAEIOU]","");
    }
}
