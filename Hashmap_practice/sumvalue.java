package Hashmap_practice;
import java.util.*;


public class sumvalue {
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("ammu",1);
        map.put("appa",2);
        map.put("ammma",3);
        map.put("appaa",4);
        int sum=0;
        for(Integer value:map.values()){
            sum+=value;
        }
        System.out.println(sum);
    }
    
}
