
import java.util.*;
import java.util.Map.Entry;
public class CountOcc {
   public static void main(String[] args) {
    int[]arr={1,1,2,5,5,5,6};
    Map<Integer,Integer> freq=new HashMap<>();
    for(int e:arr){
        if(!freq.containsKey(e)){
            freq.put(e, 1);
        }else{
            freq.put(e,freq.get(e)+1);
        }
    }
   int maxFreq=0,anskey=-1;
   for (Entry<Integer, Integer> e :freq.entrySet()){
     if(e.getValue()>maxFreq){
       maxFreq=e.getValue();
       anskey=e.getKey();
     }
   }
   System.out.printf("occurance is %d and the value %d ",maxFreq,anskey);

   } 
}
