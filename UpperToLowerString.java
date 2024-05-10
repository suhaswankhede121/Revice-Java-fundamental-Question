
import java.util.*;
class UpperToLowerString{
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("SuhAs124WanKHedE");
        System.out.println(" Original String : "+str);

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int num=Character.getNumericValue(ch);
            int ascii=(int)ch;
            boolean flag=true;
            if(ascii>=97) flag=false;
            if(flag==true){
                if(ch==num) continue;
                ascii+=32;
                char ch1=(char)ascii;
                str.setCharAt(i, ch1);
            }else{
                 if(ch==num) continue;
                ascii-=32;
                char ch1=(char)ascii;
                str.setCharAt(i, ch1);
            }

        }
        System.out.println(str);
    }
}