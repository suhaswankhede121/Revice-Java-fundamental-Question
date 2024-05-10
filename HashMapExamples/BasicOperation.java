import java.util.HashMap;
import java.util.Map;

public class BasicOperation {
    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<>();
        mp.put("suhas",25);
        mp.put("tofik",26);
        mp.put("xyz",78);
        mp.put("uee",90);
        System.out.println(mp.get("xyz"));
        //to traveres in the hashamp
        for(String key:mp.keySet()){
            System.out.printf("Key is %s and values is %d \n",key ,mp.get(key));
        }
        // 2nd way of travesing is
System.out.println();
        for(Map.Entry<String,Integer> e:mp.entrySet()){
           System.out.printf("Key is %s and values is %d \n",e.getKey(),e.getValue());

        }
        System.out.println();
        //3rd way 
        for(var e:mp.entrySet()){
        System.out.printf("Key is %s and values is %d \n",e.getKey(),e.getValue());

        }
    }
}
