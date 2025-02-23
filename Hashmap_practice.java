import java.util.*;

 public class Hashmap_practice {
 

    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("ammu",1);
        map.put("appa",2);
        map.put("ammma",3);
        map.put("appaa",4);
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        for(String key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }

      for(Integer value:map.values()){
        System.out.println(value);
      }

           map.forEach((key, value) -> System.out.println(key + " " + value));


        
    }
    
 }