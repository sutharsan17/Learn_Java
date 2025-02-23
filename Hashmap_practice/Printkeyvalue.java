package Hashmap_practice;
import java.util.*;
public class Printkeyvalue {
    public static void main(String[] args) {
        
        HashMap<String,Integer> map=new HashMap<>();
        map.put("ammu",1);
         map.put("appa",2);
         map.put("ammma",3);
 for(Map.Entry<String,Integer> entry:map.entrySet()){
    System.out.println(entry.getKey()+"->"+entry.getValue());
 }
 map.forEach((key,value) ->System.out.println(key+" + "+value));
    }
    
}
