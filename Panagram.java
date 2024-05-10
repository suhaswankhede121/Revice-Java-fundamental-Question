public class Panagram {
    public static void main(String[] args) {
        String str="The Quick brown fox jumps over the lazy do";
        System.out.println(isPanagram(str.toLowerCase()));
    }
    static boolean isPanagram(String str){
      if(str.length()<26){
        return false;
      }else{
        for(char ch='a';ch<='z';ch++){
            if(str.indexOf(ch)<0){
                return false;
            }
        }
            return true;
      }
    }
     
}
