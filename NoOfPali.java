public class NoOfPali {
    static boolean isNoOfPali(String str){
        int i=0;
        int j=str.length()-1;
       while(i<j){
        if(str.charAt(i)!=str.charAt(j)) return false; //to check palindrome logic
        i++;
        j--;
       }
       return true;
    }
    public static void main(String[] args) {
        String str="abcba";
      //System.out.println(isNoOfPali(str));
      int count=0;
      for(int i=0;i<str.length();i++){
        for(int j=i+1;j<=str.length();j++){
            if(isNoOfPali(str.substring(i,j))==true){
             System.out.println(str.substring(i,j)+" ");
            count++;
            }
           
        }
      }
      System.out.print("\n Is palindrome "+count);
    }
}
