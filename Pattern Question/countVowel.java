
//Problem statement
//"abc" substring a ab abc b bc c vowel in each 1+1+1+0+0+0=3
//output: sum=3

public class countVowel {
    public static void main(String[] args) {
        String s="abc";
        int sum=0;
        int count=0;
        int arr[]=new int[s.length()];
         String ss=null;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                ss=s.substring(i, j);
                arr[j]=ss.charAt(i);
            }
        }
    }
}
